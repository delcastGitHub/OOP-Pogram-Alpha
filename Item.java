/**
 * @Author      : Milko Del Castillo
 * @Version     : v. 1.0
 * @Since       : 09/28/2018
 * FileName     :Item.java
 * Description  :Interface Item will force all classes to implement
 * the following functions
 */

package sample;

import java.util.Date;

public interface Item {

    //String constant
    String MANUFACTURER = "OracleProduction";

    /**
     * public setProductionNumber method to set  production number
     * @param: int type, productionNumber
     */
    public void setProductionNumber(int productionNumber);

    /**
     * public setName method to set  item's name
     * @param: String type, name
     */
    public void setName(String name);

    /**
     * public getName method to get item's name
     */
    public void getName(String name);

    /**
     * public getManufactureDate method to get the manufactured date
     * @return: Data type value
     */
    public Date getManufactureDate();

    /**
     * public getSerialNumber method to get the serial number of the item
     * @return: int type value
     */
    public int getSerialNumber();

} //end of interface Item
