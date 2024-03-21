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
@brief Class Bus
public class Bus 
*/ 
public class Bus extends Vehicle {

    public int seats;
    
    public Bus(String plate, int year, int seats) {
        super(plate, year);
        this.seats = seats;
    }
    
    public void setSeats(int seats) {
        this.seats = seats;
    }
    
    public int getSeats() {
        return seats;
    }
    
    @Override
    public void displayData() {
        super.displayData();
        System.out.println("Assentos: " + seats);
    }
}

