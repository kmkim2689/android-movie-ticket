package woowacourse.movie.presenter.contract

import woowacourse.movie.model.screening.Screening
import woowacourse.movie.model.ticketing.BookingDateTime

interface TicketingContract {
    interface View {
        fun assignInitialView(
            screening: Screening,
            count: Int,
        )

        fun updateCount(count: Int)

        fun updateDate(date: String)

        fun updateTime(time: String)

        fun navigateToSeatSelection(
            screeningId: Long,
            count: Int,
            bookingDateTime: BookingDateTime,
            movieTitle: String?,
        )

        fun showToastMessage(message: String)
    }

    interface Presenter {
        fun initializeTicketingData()

        fun decreaseCount()

        fun increaseCount()

        fun reserveTickets()

        fun updateDate(date: String)

        fun updateTime(time: String)
    }
}
