package woowacourse.movie.presenter.contract

import woowacourse.movie.model.theater.SeatClass
import woowacourse.movie.model.theater.TheaterSize

interface SeatSelectionContract {
    interface View {
        fun initializeSeatTable(
            theaterSize: TheaterSize,
            rowClassInfo: Map<Int, SeatClass>,
            movieTitle: String,
            totalPrice: Int,
        )

//        fun selectSeat(
//            textView: TextView,
//            row: Int,
//            column: Int,
//            seatClass: SeatClass,
//        )
//
//        fun cancelSeat(
//            textView: TextView,
//            row: Int,
//            column: Int,
//            seatClass: SeatClass,
//        )

        fun toggleSeat(
            row: Int,
            column: Int,
            seatClass: SeatClass,
            isSelected: Boolean,
            columnSize: Int,
        )

        fun updateTotalPrice(totalPrice: Int)

        fun updateButtonStatus(isAvailable: Boolean)

        fun navigateToResultScreen(
            movieId: Long,
            count: Int,
            seats: Array<String>,
            totalPrice: Int,
        )

        fun showToastMessage(message: String)
    }

    interface Presenter {
        fun initializeSeats(
            screeningId: Long,
            numOfTickets: Int,
            date: String?,
            time: String?,
            title: String?,
        )

        fun makeReservation(
            movieId: Long,
            count: Int,
        )

//        fun addSeat(
// //            textView: TextView,
//            row: Int,
//            column: Int,
//            seatClass: SeatClass,
//        )
//
//        fun removeSeat(
// //            textView: TextView,
//            row: Int,
//            column: Int,
//            seatClass: SeatClass,
//        )
        fun updateSeat(
            row: Int,
            column: Int,
            seatClass: SeatClass,
            columnSize: Int,
        )
    }
}
