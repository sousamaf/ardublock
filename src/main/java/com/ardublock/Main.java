package com.ardublock;

import java.io.IOException;
import java.util.Locale;

import javax.swing.JFrame;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import com.ardublock.core.Context;
import com.ardublock.ui.ConsoleFrame;
import com.ardublock.ui.OpenblocksFrame;

public class Main
{
	public static void main(String args[]) throws SAXException, IOException, ParserConfigurationException
	{
		Locale swedishLocale = new Locale("pt", "BR");
		Locale.setDefault(swedishLocale);

		Main me = new Main();
		me.startArdublock();
	}
	
	public void startArdublock() throws SAXException, IOException, ParserConfigurationException
	{
		startOpenblocksFrame();
		//startConsoleFrame();
	}
	
	private void startOpenblocksFrame() throws SAXException, IOException, ParserConfigurationException
	{
		OpenblocksFrame openblocksFrame = new OpenblocksFrame();
		openblocksFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Context context = Context.getContext();
		context.setInArduino(false);
		openblocksFrame.setVisible(true);
	}

	@SuppressWarnings("unused")
	private void startConsoleFrame()
	{
		ConsoleFrame consoleFrame = new ConsoleFrame();
		consoleFrame.setVisible(true);
	}
}
