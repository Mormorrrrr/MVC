import java.util.HashMap;
import java.util.Map;

public class ColorModel {
    // Map ไว้สำหรับเก็บรหัสสีของวัวแต่ละตัว
    private Map<String, String> registeredColors;

    public ColorModel() {
        registeredColors = new HashMap<>();
    }

    // นำมาตรวจสอบสีกับรหัสของวัว
    public boolean registerColor(String color, String code) {
        if (isCodeUnique(code)) {
            registeredColors.put(color, code);
            return true;
        }
        return false;
    }

    // ตรวจว่าสีมีการซ้ำกันหรือไม่
    public boolean isCodeUnique(String code) {
        return !registeredColors.containsValue(code);
    }

    // บันทึกข้อมูลลงไปใน Map
    public Map<String, String> getRegisteredColors() {
        return registeredColors;
    }
}
