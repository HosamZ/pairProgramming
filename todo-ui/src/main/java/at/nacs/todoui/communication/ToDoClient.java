package at.nacs.todoui.communication;

import at.nacs.todoui.model.ToDo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class ToDoClient {
  private final RestTemplate restTemplate;

  @Value("${todo.server.url}")
  private String url;

  public ToDo sendToSave(ToDo toDo) {
    return restTemplate.postForObject(url, toDo, ToDo.class);
  }

  public void sendToMarkAsDone(String id) {
    restTemplate.put(url + "/" + id + "/done", ToDo.class);
  }

  public List<ToDo> getAllToDos() {
    ToDo[] arrayTodo = restTemplate.getForObject(url, ToDo[].class);
    return new ArrayList<>(Arrays.asList(arrayTodo));
  }

  public void delete(String id) {
    restTemplate.delete(url + "/" + id);
  }
}

