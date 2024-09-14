public class BrownColorCodeView extends ColorCodeView {
    //View 2 วัวสีน้ำตาล
    public BrownColorCodeView() {
        super("Brown");
    }

    //รับค่ารหัสของวัวสีน้ำตาลจาก ColorView
    @Override
    protected boolean validateCode(String code) {
        if (!super.validateCode(code)) {
            return false;
        }

        // ตรวจสอบเงื่อนไขของวัวสีน้ำตาล
        if (!code.matches(".*[!@#$%^&*].*")) {
            messageLabel.setText("Code must contain at least one special character.");
            return false;
        }
        return true;
    }
}
