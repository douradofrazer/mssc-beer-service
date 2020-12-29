package dev.fraz.msscbeerservice.web.mappers;

import dev.fraz.msscbeerservice.domain.Beer;
import dev.fraz.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
  BeerDto beerToBeerDto(Beer beer);

  Beer beerDtoToBeer(BeerDto beerDto);
}
