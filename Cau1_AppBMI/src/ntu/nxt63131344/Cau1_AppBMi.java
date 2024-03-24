package ntu.nxt63131344;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class Cau1_AppBMi extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField edtChieucao;
    private JTextField edtCannang;
    private JRadioButton rdbtnNewRadioButton;
    private JRadioButton rdbtnNewRadioButton_1;
    private ButtonGroup genderGroup;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Cau1_AppBMi frame = new Cau1_AppBMi();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Cau1_AppBMi() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 497, 566);
        contentPane = new JPanel();
        contentPane.setBackground(Color.WHITE);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Máy tính chỉ số BMI");
        lblNewLabel.setForeground(Color.BLACK);
        lblNewLabel.setBackground(Color.MAGENTA);
        lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
        lblNewLabel.setBounds(142, 5, 219, 50);
        contentPane.add(lblNewLabel);

        JButton btnNewButton_1 = new JButton("Cài lại");
        btnNewButton_1.setBackground(Color.LIGHT_GRAY);
        btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\ADMINIS\\Downloads\\reset.png"));
        btnNewButton_1.setBounds(290, 366, 100, 50);
        contentPane.add(btnNewButton_1);

        JButton btnNewButton = new JButton("Tính toán");
        btnNewButton.setForeground(Color.BLACK);
        btnNewButton.setBackground(Color.CYAN);
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (XacNhan()) {
                    double chieuCao = Double.parseDouble(edtChieucao.getText());
                    double canNang = Double.parseDouble(edtCannang.getText());
                    String gioiTinh = "";
                    if (rdbtnNewRadioButton.isSelected()) {
                        gioiTinh = "Nam";
                    } else if (rdbtnNewRadioButton_1.isSelected()) {
                        gioiTinh = "Nữ";
                    }

                    double bmi = tinhBMI(chieuCao, canNang);
                    String result = "";
                    if (gioiTinh.equals("Nam")) {
                        result = BMINam(bmi);
                    } else if (gioiTinh.equals("Nữ")) {
                        result = BMINu(bmi);
                    }
                    JOptionPane.showMessageDialog(null, "Chỉ số BMI của bạn là: " + bmi + ". " + result);
                }
            }
        });
        btnNewButton.setIcon(new ImageIcon("C:\\Users\\ADMINIS\\Downloads\\calculator (3).png"));
        btnNewButton.setBounds(90, 366, 176, 50);
        contentPane.add(btnNewButton);

        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255),
                new Color(160, 160, 160)), "Giới tính", TitledBorder.LEADING, TitledBorder.TOP, null,
                new Color(0, 0, 0)));
        panel.setBounds(90, 90, 300, 70);
        contentPane.add(panel);
        panel.setLayout(null);

        rdbtnNewRadioButton = new JRadioButton("Nam");
        rdbtnNewRadioButton.setBounds(33, 29, 103, 21);
        panel.add(rdbtnNewRadioButton);

        rdbtnNewRadioButton_1 = new JRadioButton("Nữ");
        rdbtnNewRadioButton_1.setBounds(157, 29, 103, 21);
        panel.add(rdbtnNewRadioButton_1);

        genderGroup = new ButtonGroup();
        genderGroup.add(rdbtnNewRadioButton);
        genderGroup.add(rdbtnNewRadioButton_1);

        JPanel panel_1 = new JPanel();
        panel_1.setBorder(
                new TitledBorder(null, "Chiều cao", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panel_1.setBounds(88, 181, 300, 70);
        contentPane.add(panel_1);
        panel_1.setLayout(null);

        edtChieucao = new JTextField();
        edtChieucao.setBounds(33, 29, 229, 31);
        panel_1.add(edtChieucao);
        edtChieucao.setColumns(10);

        JPanel panel_1_1 = new JPanel();
        panel_1_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255),
                new Color(160, 160, 160)), "Cân nặng", TitledBorder.LEADING, TitledBorder.TOP, null,
                new Color(0, 0, 0)));
        panel_1_1.setBounds(88, 274, 300, 70);
        contentPane.add(panel_1_1);
        panel_1_1.setLayout(null);

        edtCannang = new JTextField();
        edtCannang.setBounds(37, 34, 216, 26);
        panel_1_1.add(edtCannang);
        edtCannang.setColumns(10);
    }

    private boolean XacNhan() {
        String chieuCao = edtChieucao.getText().toString();
        String canNang = edtCannang.getText().toString();

        if (chieuCao.isEmpty() || canNang.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập vào cân nặng và chiều cao", "Lỗi",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if (!rdbtnNewRadioButton.isSelected() && !rdbtnNewRadioButton_1.isSelected()) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn giới tính", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        return true;
    }

    public static double tinhBMI(double chieuCao, double canNang) {
        return canNang / Math.pow(chieuCao / 100, 2);
    }

    // BMI châu âu
    private String BMINam(double chiSoBMI) {
        if (chiSoBMI < 18.5) {
            return "Bạn cần bổ sung thêm dinh dưỡng!";
        } else if (chiSoBMI >= 18.5 && chiSoBMI <= 22.9) {
            return "Bạn có chỉ số BMI bình thường!";
        } else if (chiSoBMI >= 25) {
            return "Bạn đang bị thừa cân!";
        } else if (chiSoBMI > 25 && chiSoBMI <= 29.9) {
            return "Bạn đang ở giai đoạn tiền béo phì!";
        } else if (chiSoBMI >= 30 && chiSoBMI <= 34.9) {
            return "Bạn bị béo phì ở mức độ I!";
        } else if (chiSoBMI >= 35 && chiSoBMI <= 39.9) {
            return "Bạn bị béo phì ở mức độ II!";
        } else if (chiSoBMI >= 40) {
            return "Bạn bị béo phì ở mức độ III!";
        }
        return "";
    }

    // BMI châu á
    private String BMINu(double chiSoBMI) {
        if (chiSoBMI >= 18.5 && chiSoBMI <= 22.9) {
            return "Bạn có chỉ số BMI bình thường!";
        } else if (chiSoBMI == 23) {
            return "Bạn đang bị thừa cân!";
        } else if (chiSoBMI > 23 && chiSoBMI <= 24.9) {
            return "Bạn đang ở giai đoạn tiền béo phì!";
        } else if (chiSoBMI >= 25 && chiSoBMI <= 29.9) {
            return "Bạn bị béo phì ở mức độ I!";
        } else if (chiSoBMI >= 30 && chiSoBMI <= 39.9) {
            return "Bạn bị béo phì ở mức độ II!";
        }
        return "";
    }
}
