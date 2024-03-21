/*
 * Copyright (C) 2024 Christian Amsberg Janner <janner.chris15@outlook.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package Aula11;

/**
 *
 * @author Christian Amsberg Janner <janner.chris15@outlook.com>
@date 20/03/2024
@brief Class Vehicle
public class Vehicle
*/ 
public class Vehicle {

    private String plate;
    private int year;
    
    public Vehicle() {
        this.plate = "";
        this.year = 0;
    }
    
    public Vehicle(String plate, int year) {
        this.plate = plate;
        this.year = year;
    }
    
    public void setPlate(String plate) {
        this.plate = plate;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
    
    public void setYear(String year) {
        this.year = Integer.parseInt(year);
    }
    
    public String getPlate() {
        return plate;
    }
    
    public int getYear() {
        return year;
    }
    
    public void displayData() {
        System.out.println("Placa: " + plate);
        System.out.println("Ano: " + year);
    }
}
