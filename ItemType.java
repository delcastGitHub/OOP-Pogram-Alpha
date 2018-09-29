/**
 * @Author      : Milko Del Castillo
 * @Version     : v. 1.0
 * @Since       : 09/28/2018
 * FileName     :ItemType.java
 * Description  :This class creates a pre-set type of items
 */
package sample;

public enum ItemType {

    AUDIO("AU"),
    VISUAL("VI"),
    AUDIO_MOBILE("AM"),
    VISUAL_MOBILE("VM");

    public final String code;

     //Constructor method to initialize an ItemType type object
    ItemType(String code) {
        this.code = code;
    }

    /**
     * public getCode method
     * @return: String type, code
     */
    public String getCode() {
        return code;
    }
}