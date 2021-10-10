package org.wordpress.android.ui.mysite.cards.post

import org.wordpress.android.ui.mysite.MySiteCardAndItem.Card.PostCard
import org.wordpress.android.ui.mysite.cards.post.mockdata.MockedPostsData
import org.wordpress.android.ui.utils.UiString.UiStringText
import javax.inject.Inject


class PostCardBuilder  @Inject constructor() {
    // build is in a temporary state until the feature has been solidified
    // We have not decided what happens if there is no title
    fun build(mockedPostsData: MockedPostsData): List<PostCard> {
        val cards = mutableListOf<PostCard>()
        mockedPostsData.posts?.draft?.map {
            cards.add(PostCard(
                    title = UiStringText("Draft Post"),
                    postTitle = UiStringText(it.title?:"No title")))
        }
        mockedPostsData.posts?.scheduled?.map {
            cards.add(PostCard(
                    title = UiStringText("Scheduled Post"),
                    postTitle = UiStringText(it.title?:"No title")))
        }
        return cards
    }
}
