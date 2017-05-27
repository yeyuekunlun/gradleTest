package spittr.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spittr.Spittle;
import spittr.data.SpittleRepository;

@Controller
@RequestMapping("/spittles")
public class SpittleController {

  private SpittleRepository spittleRepository;

  @Autowired
  public SpittleController(SpittleRepository spittleRepository) {
    this.spittleRepository = spittleRepository;
  }

  @RequestMapping(method=RequestMethod.GET)
  public List<Spittle> spittles()
  {
    return spittleRepository.findSpittles(Long.MAX_VALUE, 20);
  }
  
  @RequestMapping(value="/{spittleId}",method=RequestMethod.GET)
  public Spittle findOneSpittles(@PathVariable("spittleId") int i)
  {
    return spittleRepository.findOneSpittles(i);
  }

}
