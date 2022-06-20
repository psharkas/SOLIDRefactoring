//import static org.junit.jupiter.api.Assertions.*;
//
//import org.junit.jupiter.api.Test;
//
//class Tests {
//	
//	@Test
//	void testDVDInstance() {
//		DVD dvd1 = new DVD();
//		assertNotNull(dvd1);
//	}
//	
//	@Test
//	void testDVDTitle() {
//		DVD dvd2 = new DVD();
//		String expected = "Avatar the Last Airbender";
//		dvd2.setTitle("Avatar the Last Airbender");
//		String actual = dvd2.getTitle();
//		assertEquals(expected,actual);
//	}
//	
//	@Test
//	void testDVDRunTime() {
//		DVD dvd3 = new DVD();
//		int expected = 103;
//		dvd3.setRunTime(103);
//		int actual = dvd3.getRunTime();
//		assertEquals(expected,actual);
//	}
//	
//	@Test
//	void testVHSInstance() {
//		VHS vhs1 = new VHS();
//		assertNotNull(vhs1);
//	}
//	
//	@Test
//	void testVHSTitle() {
//		VHS vhs2 = new VHS();
//		String expected = "Avatar the Last Airbender";
//		vhs2.setTitle("Avatar the Last Airbender");
//		String actual = vhs2.getTitle();
//		assertEquals(expected,actual);
//	}
//	
//	@Test
//	void testVHSRunTime() {
//		VHS vhs3 = new VHS();
//		int expected = 103;
//		vhs3.setRunTime(103);
//		int actual = vhs3.getRunTime();
//		assertEquals(expected,actual);
//	}
//	
//	@Test
//	void testVHSCurrentTime() {
//		VHS vhs4 = new VHS();
//		int expected = 0;
//		int actual = vhs4.getCurrentTime();
//		assertEquals(expected,actual);
//	}
//	
//	@Test
//	void testVHSPlay() {
//		VHS vhs5 = new VHS();
//		vhs5.setTitle("Avatar the Last Airbender");
//		vhs5.scenes.add("Aang awakes");
//		vhs5.scenes.add("Aang fights Zuko");
//		vhs5.scenes.add("Aang beats up the Fire Nation");
//		vhs5.play();
//		int expected = 1;
//		int actual = vhs5.getCurrentTime();
//		assertEquals(expected,actual);
//	}
//	
//	@Test
//	void testVHSPlayExtended() {
//		VHS vhs5 = new VHS();
//		vhs5.setTitle("Avatar the Last Airbender");
//		vhs5.scenes.add("Aang awakes");
//		vhs5.scenes.add("Aang fights Zuko");
//		vhs5.scenes.add("Aang beats up the Fire Nation");
//		vhs5.play();
//		vhs5.play();
//		vhs5.play();
//		vhs5.play();
//		int expected = 0;
//		int actual = vhs5.getCurrentTime();
//		assertEquals(expected,actual);
//	}
//	
//	@Test
//	void testVHSRewind() {
//		VHS vhs5 = new VHS();
//		vhs5.setTitle("Avatar the Last Airbender");
//		vhs5.scenes.add("Aang awakes");
//		vhs5.scenes.add("Aang fights Zuko");
//		vhs5.scenes.add("Aang beats up the Fire Nation");
//		vhs5.play();
//		vhs5.play();
//		vhs5.play();
//		vhs5.rewind();
//		int expected = 0;
//		int actual = vhs5.getCurrentTime();
//		assertEquals(expected,actual);
//	}
//
//
//}
