import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ColorCodeView extends JFrame {
    //สร้างหน้าจอ UI หลักสำหรับเลือกแต่ละสี
    protected JTextField codeField;
    protected JButton submitButton;
    protected JLabel messageLabel;
    private String colorName;

    public ColorCodeView(String colorName) {
        this.colorName = colorName;

        //Set ขนาด คำ และปุ่มให้เลือก
        setTitle(colorName + " Color Code Registration");
        setLayout(new FlowLayout());
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new JLabel("Enter 8-digit code for " + colorName + ":"));

        codeField = new JTextField(10);
        add(codeField);

        submitButton = new JButton("Submit");
        add(submitButton);

        messageLabel = new JLabel();
        add(messageLabel);

        setVisible(true);
    }

    // Set ActionListener ของปุ่ม Submit
    public void setSubmitActionListener(ActionListener listener) {
        submitButton.addActionListener(listener);
    }

    // คืนค่าข้อความ
    public String getCode() {
        return codeField.getText();
    }

    // คืนค่าสี
    public String getColorName() {
        return colorName;
    }

    // Requirement คือ วัวแต่ละสี จะรับข้อมูลเหมือนกันคือ รหัสของวัว เป็นเลข 8 หลักที่เลขตัวแรกไม่ใช่ 0, และรหัสของฟาร์ม เป็นเลข 1 หลักที่ไม่ใช่ 0 ขณะเดียวกัน
    protected boolean validateCode(String code) {
        if (code.length() != 8) {
            return false;
        }
        if (code.charAt(0) == '0') {
            return false;
        }
        return true;
    }

    // แดสงข้อความๆต่างๆใน View
    public void displayMessage(String message) {
        messageLabel.setText(message);
    }

}