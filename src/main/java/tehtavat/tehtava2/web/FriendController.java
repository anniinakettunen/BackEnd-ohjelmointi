package tehtavat.tehtava2.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import tehtavat.tehtava2.domain.Friend;

@Controller
public class FriendController {

    private List<Friend> friends = new ArrayList<>();

    // GET: näyttää ystävälistan ja lomakkeen samalla sivulla
    @GetMapping("/friends")
    public String showFriends(Model model) {
        model.addAttribute("friends", friends);
        model.addAttribute("newFriend", new Friend()); // lomakkeen tyhjä olio
        return "friends"; 
    }

    // POST: tallentaa uuden ystävän ja palaa samalle sivulle
    @PostMapping("/friends")
    public String saveFriend(@ModelAttribute("newFriend") Friend friend, Model model) {
        friends.add(friend);
        model.addAttribute("friends", friends);
        model.addAttribute("newFriend", new Friend()); // tyhjennetään lomake
        return "friends"; 
    }
}
