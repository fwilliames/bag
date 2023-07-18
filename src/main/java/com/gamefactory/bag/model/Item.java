package com.gamefactory.bag.model;

public class Item{

    private String name;
    private String description;
    /*add other attributes*/

    Item(String newName, String newDescription){
        this.setName(newName);
        this.setDescription(newDescription);
    }

    private void setName(String newName){
        this.name = newName;
    }

    public String getName(){
        return this.name;
    }

    private void setDescription(String newDescription){
        this.description = newDescription;
    }

    public String getDescription(){
        return this.description;
    }

    public void itemInformation(){

        /*Formatting the Name to Uppercase */
        String tempName = this.getName();
        tempName = tempName.substring(0, 1).toUpperCase() + tempName.substring(1);

        /*Formatting the Description to Uppercase */
        String tempDescription = this.getDescription();
        tempDescription = tempDescription.substring(0, 1).toUpperCase() + tempDescription.substring(1);

        /*Create the itemInformation*/
        String temp = "Nome: " + tempName +"\n" + "Descricao: " + tempDescription + "\n";

        /*Print the Information*/
        System.out.println(temp);
    }

}

