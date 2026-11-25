/**
 Ticket Booking Simulation
 Assumption:
 There are only 4 movies to choose from. You may assign the movie.
 Each movie can only accommodate 10 seats.
 Movie schedule: 1:00 PM – Regular (₱450), 3:00 PM – Regular (₱450), 5:00 PM – 3D (₱950),
 7:00 PM – Director’s Cut (₱1500)
 To reserve a movie ticket, the user needs to pay the amount and provide the name for the available slots. A seat is considered
 vacant if no name is assigned to it. (open for reservation).

 Implementation:
 Specific requirement for array implementation: List of Movies, List of Movie Schedules, Movie Schedule Seats.
 Processes:
 1. User Menu:
 Input: User selects an option from the list - Reserve Movie ticket, Cancel Movie Ticket, check available seats.
 Output: Display selected option and request necessary input based on selected choice

 2. Reserve Movie Ticket:
 Input: User selects a movie from the list (any movie name with assigned cinema).
 Output: Display movie details such as showtime and available seats.

 3. Select Showtime and seats:
 Input: User selects a preferred showtime and number of seats.
 Computation: Check if enough tickets are available for the selected showtime (simulate availability). Validate seat selection
 (check for any conflicts with other selections). Calculate the total cost based on the number of tickets.
 Output: Display available tickets or error message if not enough seats are available. Show updated seat map with selected seats
 and confirm availability. Display a summary of the booking (movie, showtime, seats, total cost).

 4. Payment:
 Input: User inputs the reservation name and proceeds to payment. Input payment (amount)
 Computation: Simulate a payment process (e.g., simulate success or failure based on input).
 Output: Display change (if applicable) and a confirmation message (e.g., “Payment Successful!” or “Payment Failed”). Display
 “Booking Confirmed” message and exit.

 5. Cancel Movie Ticket
 Input: User selects movie and showtime. User provides name used for reservation.
 Computation: Search for matching name in seat array. If found, clear the seat (set to null).
 Output: If successful: “Reservation cancelled for [name].” If not found: “No reservation found under that name.”Return 70% of
 the payment.

 6. Check Available Seats
 Input: User selects movie and showtime
 Computation: Count vacant seats in the selected showtime
 Output: Display number of available seats

 SAMPLE SIMULATION OF THE SYSTEM
 --- Ticket Booking System ---
 1. Reserve Movie Ticket
 2. Cancel Movie Ticket
 3. Check Available Seats
 4. Exit
 Select an option: 1
 Available Movies:
 1. Action Blast
 2. Comedy Hour
 3. Drama Nights
 4. Sci-Fi Saga
 Select a movie: 2
 Available Showtimes for Comedy Hour:
 1. 1:00 PM – Regular (₱450)
 2. 3:00 PM – Regular (₱450)

 3. 5:00 PM – 3D (₱950)
 4. 7:00 PM – Director’s Cut (₱1500)
 Select showtime: 3
 Available Seats:
 [1] Vacant
 [2] Vacant
 [3] Vacant
 [4] Vacant
 [5] Vacant
 [6] Vacant
 [7] Vacant
 [8] Vacant
 [9] Vacant
 [10] Vacant
 Enter number of seats to reserve: 2
 Enter seat number: 1
 Enter seat number: 2
 Enter reservation name: Alex
 Total cost: ₱1900
 Enter payment amount: 2000
 Payment Successful!
 Change: ₱100
 Booking Confirmed for Alex
 Movie: Comedy Hour
 Showtime: 5:00 PM
 Reserved Seats: [1], [2]

 --- Ticket Booking System ---
 1. Reserve Movie Ticket
 2. Cancel Movie Ticket
 3. Check Available Seats
 4. Exit
 Select an option: 3
 Available Movies:
 1. Action Blast
 2. Comedy Hour
 3. Drama Nights
 4. Sci-Fi Saga
 Select a movie: 2
 Available Showtimes for Comedy Hour:
 1. 1:00 PM – Regular (₱450)
 2. 3:00 PM – Regular (₱450)
 3. 5:00 PM – 3D (₱950)
 4. 7:00 PM – Director’s Cut (₱1500)
 Select showtime: 3
 Available Seats for Comedy Hour at 5:00 PM:
 [1] Alex
 [2] Alex
 [3] Vacant
 [4] Vacant
 [5] Vacant
 [6] Vacant
 [7] Vacant
 [8] Vacant
 [9] Vacant
 [10] Vacant

 Total Vacant Seats: 8
 --- Ticket Booking System ---
 1. Reserve Movie Ticket
 2. Cancel Movie Ticket
 3. Check Available Seats
 4. Exit
 Select an option: 2
 Available Movies:
 1. Action Blast
 2. Comedy Hour
 3. Drama Nights
 4. Sci-Fi Saga
 Select a movie: 2
 Available Showtimes for Comedy Hour:
 1. 1:00 PM – Regular (₱450)
 2. 3:00 PM – Regular (₱450)
 3. 5:00 PM – 3D (₱950)
 4. 7:00 PM – Director’s Cut (₱1500)
 Select showtime: 3
 Enter reservation name to cancel: Alex
 Reservation cancelled for Alex.
 Refund Amount: ₱1330 (70% of ₱1900)
 --- Ticket Booking System ---
 1. Reserve Movie Ticket
 2. Cancel Movie Ticket
 3. Check Available Seats
 4. Exit
 Select an option: 4
 Thank you for using the Ticket Booking System!
 */

import java.util.Scanner;

public class TicketBookingSimulation {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.print(" --- Ticket Booking System ---");
        System.out.println("[1] Reserve Movie Ticket");
        System.out.println("[2] Cancel Movie Ticket");
        System.out.println("[3] Check Available Seats");
        System.out.println("[4] Exit");
        System.out.print("Select an option: ");
        int choice = Integer.parseInt(kbd.nextLine());
        if (choice == 1 || choice == 2 || choice == 3 || choice == 4 || choice == 0) {
            switch (choice) {
                case 1:
                    ReserveMovieTicket();
                    break;
                case 2:
                    CancelMovieTicket();
                    break;
                case 3:
                    CheckAvailableSeats();
                    break;
                case 4:
                    System.out.println(" Thank you for using the Ticket Booking System! ");
                    System.exit(0);
                    break;
            } // switch statement in if statement
        }  // if statement in while
    }

    /** [1] RESERVE MOVIE TICKET
     --- Ticket Booking System ---
     1. Reserve Movie Ticket
     2. Cancel Movie Ticket
     3. Check Available Seats
     4. Exit
     Select an option: 1
     Available Movies:
     1. Action Blast
     2. Comedy Hour
     3. Drama Nights
     4. Sci-Fi Saga
     Select a movie: 2
     Available Showtimes for Comedy Hour:
     1. 1:00 PM – Regular (₱450)
     2. 3:00 PM – Regular (₱450)

     3. 5:00 PM – 3D (₱950)
     4. 7:00 PM – Director’s Cut (₱1500)
     Select showtime: 3
     Available Seats:
     [1] Vacant
     [2] Vacant
     [3] Vacant
     [4] Vacant
     [5] Vacant
     [6] Vacant
     [7] Vacant
     [8] Vacant
     [9] Vacant
     [10] Vacant
     Enter number of seats to reserve: 2
     Enter seat number: 1
     Enter seat number: 2
     Enter reservation name: Alex
     Total cost: ₱1900
     Enter payment amount: 2000
     Payment Successful!
     Change: ₱100
     Booking Confirmed for Alex
     Movie: Comedy Hour
     Showtime: 5:00 PM
     Reserved Seats: [1], [2]

     */
    public static void ReserveMovieTicket() {
        System.out.println("Available Movies:");
        System.out.println("[1] Action Blast");
        System.out.println("[2] Comedy Hour");
        System.out.println("[3] Drama Nights");
        System.out.println("[4] Sci-Fi Saga");

    }

    public static void CancelMovieTicket() {

    }

    public static void CheckAvailableSeats() {

    }
}
