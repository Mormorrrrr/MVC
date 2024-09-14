public class ColorController {
    private ColorModel model;
     private ColorCodeView view;
    
    public ColorController(ColorModel model, ColorCodeView view) {
        //เชื่อมการทำงานระหว่าง Class Model กัย Class View
        this.model = model; 
        this.view = view;
    
        // สร้างตัวควบคุมปุ่ม submit
        this.view.setSubmitActionListener(e -> {
            String color = this.view.getColorName();  // นำ Class View มาใช้
            String code = this.view.getCode();        // นำ Class View มาใช้
    
            if (this.model.isCodeUnique(code)) {      // นำ Class Model มาใช้
                if (this.view.validateCode(code)) {
                    boolean registered = this.model.registerColor(color, code);  // นำ Class Model มาใช้
                    if (registered) {
                        this.view.displayMessage("Code registered successfully for " + color + "!");
                    } else {
                        this.view.displayMessage("Error registering the code.");
                    }
                   } else {
                    this.view.displayMessage("Invalid code based on the specific color rules.");
                }
            } else {
                this.view.displayMessage("Code already registered for another color.");
            }
        });
    }  
}
