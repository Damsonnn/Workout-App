package com.damcio.workoutapp.controller;

import com.damcio.workoutapp.model.BodyPart;
import com.damcio.workoutapp.service.BodyPartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bodyParts")
public class BodyPartController {

    @Autowired
    private BodyPartService bodyPartService;

    @PostMapping
    public ResponseEntity<BodyPart> createBodyPart(@RequestBody BodyPart bodyPart){
        BodyPart savedBodyPart = bodyPartService.createBodyPart(bodyPart);
        return new ResponseEntity<>(savedBodyPart, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<BodyPart> getBodyPartById(@PathVariable("id") Integer id){
        BodyPart bodyPart = bodyPartService.getBodyPartById(id);
        return new ResponseEntity<>(bodyPart, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<BodyPart>> getAllBodyParts(){
        List<BodyPart> bodyParts = bodyPartService.getAllBodyParts();
        return new ResponseEntity<>(bodyParts, HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<BodyPart> updateBodyPart(@PathVariable("id") Integer id, @RequestBody BodyPart bodyPart){
        bodyPart.setId(id);
        BodyPart updatedBodyPart = bodyPartService.updateBodyPart(bodyPart);
        return new ResponseEntity<>(updatedBodyPart, HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteBodyPart(@PathVariable("id") Integer id){
        bodyPartService.deleteBodyPart(id);
        return new ResponseEntity<>("BodyPart deleted", HttpStatus.OK);
    }
}
