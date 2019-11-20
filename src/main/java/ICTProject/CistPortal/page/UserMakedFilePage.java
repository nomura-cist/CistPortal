package ICTProject.CistPortal.page;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.link.Link;
import org.wicketstuff.annotation.mount.MountPath;

@MountPath("UserMakedFile")
public class UserMakedFilePage extends WebPage {
    public UserMakedFilePage() {
        Link<Void> toHomeLink = new BookmarkablePageLink<Void>("toHome",HomePage.class);
        add(toHomeLink);
    }
}