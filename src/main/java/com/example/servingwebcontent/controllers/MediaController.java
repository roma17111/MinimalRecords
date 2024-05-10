package com.example.servingwebcontent.controllers;


import lombok.SneakyThrows;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileInputStream;

@RestController
@RequestMapping("/files")
public class MediaController {

    @SneakyThrows
    @GetMapping("/main")
    public ResponseEntity<?> getMainImage() {
        Resource resource = new InputStreamResource(new FileInputStream("media/Minrec.jpg"));
        return ResponseEntity.ok()
                .contentType(MediaType.IMAGE_JPEG)
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment: filename= \"main.jpeg\"")
                .body(resource);
    }
    @SneakyThrows
    @GetMapping("/photos/1")
    public ResponseEntity<?> getPhotoOne() {
        Resource resource = new InputStreamResource(new FileInputStream("media/ourphotos/2023-01-05 17-21-46 (2).JPG"));
        return ResponseEntity.ok()
                .contentType(MediaType.IMAGE_JPEG)
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment: filename= \"main.jpeg\"")
                .body(resource);
    }
    @SneakyThrows
    @GetMapping("/photos/2")
    public ResponseEntity<?> getPhotoTwo() {
        Resource resource = new InputStreamResource(new FileInputStream("media/ourphotos/2023-01-05 17-21-46 (3).JPG"));
        return ResponseEntity.ok()
                .contentType(MediaType.IMAGE_JPEG)
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment: filename= \"main.jpeg\"")
                .body(resource);
    }
    @SneakyThrows
    @GetMapping("/photos/3")
    public ResponseEntity<?> getPhotoThree() {
        Resource resource = new InputStreamResource(new FileInputStream("media/ourphotos/2023-01-05 17-21-46 (4).JPG"));
        return ResponseEntity.ok()
                .contentType(MediaType.IMAGE_JPEG)
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment: filename= \"main.jpeg\"")
                .body(resource);
    }
    @SneakyThrows
    @GetMapping("/photos/4")
    public ResponseEntity<?> getPhotoFour() {
        Resource resource = new InputStreamResource(new FileInputStream("media/ourphotos/IMG_4136.JPG"));
        return ResponseEntity.ok()
                .contentType(MediaType.IMAGE_JPEG)
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment: filename= \"main.jpeg\"")
                .body(resource);
    }
    @SneakyThrows
    @GetMapping("/photos/5")
    public ResponseEntity<?> getPhotoFive() {
        Resource resource = new InputStreamResource(new FileInputStream("media/ourphotos/IMG_4141.JPG"));
        return ResponseEntity.ok()
                .contentType(MediaType.IMAGE_JPEG)
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment: filename= \"main.jpeg\"")
                .body(resource);
    }
    @SneakyThrows
    @GetMapping("/photos/6")
    public ResponseEntity<?> getPhotoSix() {
        Resource resource = new InputStreamResource(new FileInputStream("media/ourphotos/IMG_4899.JPG"));
        return ResponseEntity.ok()
                .contentType(MediaType.IMAGE_JPEG)
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment: filename= \"main.jpeg\"")
                .body(resource);
    }
    @SneakyThrows
    @GetMapping("/photos/7")
    public ResponseEntity<?> getPhotoSeven() {
        Resource resource = new InputStreamResource(new FileInputStream("media/ourphotos/IMG_5213.jpg"));
        return ResponseEntity.ok()
                .contentType(MediaType.IMAGE_JPEG)
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment: filename= \"main.jpeg\"")
                .body(resource);
    }

    @SneakyThrows
    @GetMapping("/audio/1")
    public ResponseEntity<?> getAudioOne() {
        Resource resource = new InputStreamResource(new FileInputStream("media/new-zavet.mp3"));
        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_OCTET_STREAM)
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment: filename= \"audio.mp3\"")
                .body(resource);
    }

    @SneakyThrows
    @GetMapping("/audio/2")
    public ResponseEntity<?> getAudioTwo() {
        Resource resource = new InputStreamResource(new FileInputStream("media/snegovik.mp3"));
        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_OCTET_STREAM)
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment: filename= \"audio.mp3\"")
                .body(resource);
    }
}
