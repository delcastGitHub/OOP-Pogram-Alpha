/**
 * @Author      : Milko Del Castillo
 * @Version     : v. 1.0
 * @Since       : 09/28/2018
 * FileName     :Product.java
 * Description  :Abstract class to call product that will implement
 * the Item interface.
 */
package sample;

import java.util.Date;

public abstract class Product implements Item {

    int serialNumber;
    String manufacturer;
    Date manufacturedOn;
    String name;

    static int currentProductionNumber;

    /**
     * public constructor Product
     * @param: String type, name
     */
    public Product(String name) {
        this.name = name;                           //set parameter name to this variable name.
        serialNumber = currentProductionNumber++;   //assign the next production number to serial number by increment 1
                                                    //to the last serial number
        manufacturedOn = new Date();                //get and assign the current date
        manufacturer = MANUFACTURER;
    }

    /**
     * public setProductionNumber Method to set production number
     * @param: int type, productionNumber
     */
    public void setProductionNumber(int productionNumber) {
        serialNumber = productionNumber;
    }

    /**
     * public setName method to set product name
     * @param: String type, name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * public getName method
     * @param : String type, name
     */
    public void getName(String name) {
    }

    /**
     * Public getManufactureDate method
     * @return : Date type, date.
     */
    public Date getManufactureDate() {
        return manufacturedOn;
    }

    /**
     * public getSerialNumber method
     * @return: int type, serialNumber
     */
    public int getSerialNumber() {
        return serialNumber;
    }

    /**
     * A toString method will println information
     *@return:
     * Manufacturer  : OracleProduction
     * Serial Number : 1
     * Date          : Thu May 14 15:18:43 BST 2015
     * Name          : Product Name
     */
    public String toString() {

        return

                "Manufacturer   : " + manufacturer + "\n"
                        + "Serial Number  : " + serialNumber + "\n"
                        + "Date           : " + manufacturedOn + "\n"
                        + "Name           : " + name + "\n";

    }//String end
}//Product class end
