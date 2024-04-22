package woowacourse.movie.model

data class Movie(
    val id: Long,
    val title: String,
    val thumbnail: Int,
    val date: String,
    val runningTime: Int,
    val introduction: String,
)
