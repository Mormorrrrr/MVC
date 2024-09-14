public class PinkColorCodeView extends ColorCodeView {
    //View 3 วัวสีชมพู
    public PinkColorCodeView() {
        super("Pink");
    }

    @Override
    protected boolean validateCode(String code) {
        if (!super.validateCode(code)) {
            return false;
        }

        // Requirement วัวสีชมพูจะต้องรับชื่อและนามสกุลเจ้าของ (แยกกัน) มีค่าเป็นตัวอักษรภาษาอังกฤษตัวเล็กเท่านั้นความยาวไม่เกิน 8 ตัวอักษร
        if (!code.matches(".*[a-zA-Z].*")) {
            messageLabel.setText("Code must contain at least one English letter.");
            return false;
        }
        return true;
    }
}