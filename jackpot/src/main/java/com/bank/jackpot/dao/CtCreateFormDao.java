package com.bank.jackpot.dao;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import com.bank.jackpot.dao.interfaces.ICtCreateDao;

public class CtCreateFormDao implements ICtCreateDao
{
	
	
	
	@Override
	public boolean getCert(String id)
	{
		File file = new File(".\\Jackpot\\" + id + ".txt");
		
		if(file.isFile())
			return true;
		else
			return false;
	}
	
	@Override
	public String getCertPw(String id)
	{
		if(getCert(id))
		{
			String pwd = "";
		
			try
			{
				String str = "";
				FileInputStream file = new FileInputStream(".\\Jackpot\\" + id + ".txt");
				BufferedReader in = new BufferedReader(new InputStreamReader(file));
			
				try
				{
					while((str = in.readLine()) != null)
						pwd += str;
				
					in.close();
				}
				catch (IOException e)
				{
				// 	TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			catch (FileNotFoundException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return pwd;
		}
		else
		{
			return "";
		}
	}
	
	@Override
	public void setCert(String id, String cel_pwd)
	{
		try
		{
			File file = new File(".\\Jackpot");
			
			if(!file.exists())
				file.mkdirs();

			FileOutputStream out = new FileOutputStream(".\\Jackpot\\" + id + ".txt");
			
			for(int i = 0; i < cel_pwd.length(); i++)
				out.write(cel_pwd.charAt(i));
			
			out.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args)
	{
		CtCreateFormDao ctcreatedao = new CtCreateFormDao();
		
		try
		{
			// 임시적으로 아이디 설정
			String id = "milk9503";
			
			if(ctcreatedao.getCert(id))
				System.out.println(id + "님의 공인인증서가 존재합니다.");
			else
			{
				System.out.println(id + "님의 공인인증서가 존재하지 않습니다.");

				ctcreatedao.setCert("yuhan",  "yuhan1234");
				ctcreatedao.setCert("yuhan", "yuhan1234");
				ctcreatedao.setCert("yuhan",  "yuhan1234");
				ctcreatedao.setCert("yuhan", "yuhan1234");
			}
			
			System.out.println(id + "님의 공인인증서 비밀번호: " + ctcreatedao.getCertPw(id));
			
			ctcreatedao.setCert(id, "1234");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
