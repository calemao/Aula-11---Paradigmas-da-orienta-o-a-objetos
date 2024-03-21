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
@brief Class Truck
public class Truck 
* **/
public class Truck extends Vehicle {

    public int axles;
    
    public Truck(String plate, int year, int axles) {
        super(plate, year);
        this.axles = axles;
    }
    
    public void setAxles(int axles) {
        this.axles = axles;
    }
    
    public int getAxles() {
        return axles;
    }
    
    @Override 
    public void displayData() {
        super.displayData();
        System.out.println("Eixos: " + axles);
    }
}

