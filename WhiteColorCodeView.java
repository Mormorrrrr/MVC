public class WhiteColorCodeView extends ColorCodeView {
    //View 1 วัวสีขาว
    public WhiteColorCodeView() {
        super("White");
    }

    @Override
    protected boolean validateCode(String code) {
        if (!super.validateCode(code)) {
            return false;
        }

        // วัวสีขาวจะต้องรับอายุของวัว มีหน่วยเป็นปีและเดือน มีค่าเป็นตัวเลขจํานวนเต็มที่ไม่เป็นลบ เดือนมีค่าไม่เกิน 11 และปีมีค่าไม่เกิน 10
        String month = code.substring(1, 3);  // ค่าเดือนรับได้ไม่เกิน 3 ตัว
        int monthInt = Integer.parseInt(month);
        if (monthInt > 11) {
            messageLabel.setText("Invalid month (should be <= 11)");
            return false;
        }
        return true;
    }
}