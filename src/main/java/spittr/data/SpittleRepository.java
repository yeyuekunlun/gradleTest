package spittr.data;

import java.util.List;

import spittr.Spittle;

public interface SpittleRepository {
	List<Spittle> findSpittles(long maxValue, int i);

	Spittle findOneSpittles(int i);
}
