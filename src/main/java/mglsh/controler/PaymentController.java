package mglsh.controler;

import mglsh.exception.BookNotFoundException;
import mglsh.data.CRelay;
import mglsh.data.CRelayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import javax.validation.Valid;
import java.util.List;

@RestController
public class PaymentController {

    @Autowired
    CRelayRepository cRelayRepository;

    // Get All Notes
    @GetMapping("/books")
    public List<CRelay> getAllNotes() {
        return cRelayRepository.findAll();
    }

    // Create a new Note
    @PostMapping("/books")
    public CRelay createNote(@Valid @RequestBody CRelay cRelay) {
        return cRelayRepository.save(cRelay);
    }

    // Get a Single Note
    @GetMapping("/books/{id}")
    public CRelay getNoteById(@PathVariable(value = "id") Long cRelayId) {
        return cRelayRepository.findOne(cRelayId);
    }

    // Update a Note
    @PutMapping("/cRelaies/{id}")
    public CRelay updateNote(@PathVariable(value = "id") Long cRelayId,
                           @Valid @RequestBody CRelay cRelaiesDetails) {

        CRelay cRelay = cRelayRepository.findOne(cRelayId);

        cRelay.setcRelayName(cRelaiesDetails.getcRelayName());
        cRelay.setcRelayParameter(cRelaiesDetails.getcRelayParameter());

        CRelay updatedCRelay = cRelayRepository.save(cRelay);

        return updatedCRelay;
    }

    // Delete a Note
    @DeleteMapping("/cRelaies/{id}")
    public ResponseEntity<?> deleteBook(@PathVariable(value = "id") Long cRelayId) {
        CRelay cRelay = cRelayRepository.findOne(cRelayId);

        cRelayRepository.delete(cRelay);

        return ResponseEntity.ok().build();
    }
}