package dev.fraz.msscbeerservice.web.controller;

import dev.fraz.msscbeerservice.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

  @GetMapping("/{beerId}")
  public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beerId) {

    return new ResponseEntity<>(BeerDto.builder().id(UUID.randomUUID()).build(), HttpStatus.OK);
  }

  @PostMapping
  public ResponseEntity saveNewBeer(@RequestBody BeerDto beerDto) {

    return new ResponseEntity<>(HttpStatus.CREATED);
  }

  @PutMapping("/{beerId}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void saveNewBeer(@PathVariable("beerId") UUID beerId, @RequestBody BeerDto beerDto) {}
}
