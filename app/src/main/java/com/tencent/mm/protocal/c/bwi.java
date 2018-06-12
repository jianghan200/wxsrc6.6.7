package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class bwi
  extends bhd
{
  public String jQb;
  public int jQd;
  public int rJr;
  public String rPR;
  public String raM;
  public String raN;
  public String raO;
  public bhz rcj;
  public bhz rck;
  public String rco;
  public int rdV;
  public int rdW;
  public int rdX;
  public int rmA;
  public int rmB;
  public String rmy;
  public int rmz;
  public bhy rtW;
  public int rth;
  public String rvP;
  public int rwB;
  public String rwk;
  public int sjV;
  public int soa;
  public bhz ssC;
  public String ssD;
  public String ssE;
  public int ssF;
  public int ssG;
  public String ssH;
  public int ssI;
  public int ssJ;
  public int ssK;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.ssC == null) {
        throw new b("Not all required fields were included: ClientImgId");
      }
      if (this.rcj == null) {
        throw new b("Not all required fields were included: FromUserName");
      }
      if (this.rck == null) {
        throw new b("Not all required fields were included: ToUserName");
      }
      if (this.rtW == null) {
        throw new b("Not all required fields were included: Data");
      }
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      if (this.ssC != null)
      {
        paramVarArgs.fV(2, this.ssC.boi());
        this.ssC.a(paramVarArgs);
      }
      if (this.rcj != null)
      {
        paramVarArgs.fV(3, this.rcj.boi());
        this.rcj.a(paramVarArgs);
      }
      if (this.rck != null)
      {
        paramVarArgs.fV(4, this.rck.boi());
        this.rck.a(paramVarArgs);
      }
      paramVarArgs.fT(5, this.rdV);
      paramVarArgs.fT(6, this.rdW);
      paramVarArgs.fT(7, this.rdX);
      if (this.rtW != null)
      {
        paramVarArgs.fV(8, this.rtW.boi());
        this.rtW.a(paramVarArgs);
      }
      paramVarArgs.fT(9, this.jQd);
      if (this.rco != null) {
        paramVarArgs.g(10, this.rco);
      }
      paramVarArgs.fT(11, this.rJr);
      paramVarArgs.fT(12, this.rth);
      paramVarArgs.fT(13, this.soa);
      if (this.rvP != null) {
        paramVarArgs.g(14, this.rvP);
      }
      if (this.ssD != null) {
        paramVarArgs.g(15, this.ssD);
      }
      if (this.ssE != null) {
        paramVarArgs.g(16, this.ssE);
      }
      if (this.rmy != null) {
        paramVarArgs.g(17, this.rmy);
      }
      paramVarArgs.fT(18, this.rmz);
      paramVarArgs.fT(19, this.ssF);
      paramVarArgs.fT(20, this.ssG);
      if (this.ssH != null) {
        paramVarArgs.g(21, this.ssH);
      }
      paramVarArgs.fT(22, this.ssI);
      paramVarArgs.fT(23, this.ssJ);
      paramVarArgs.fT(24, this.ssK);
      if (this.rPR != null) {
        paramVarArgs.g(25, this.rPR);
      }
      paramVarArgs.fT(26, this.rwB);
      if (this.rwk != null) {
        paramVarArgs.g(27, this.rwk);
      }
      paramVarArgs.fT(28, this.rmA);
      paramVarArgs.fT(29, this.rmB);
      paramVarArgs.fT(30, this.sjV);
      if (this.jQb != null) {
        paramVarArgs.g(31, this.jQb);
      }
      if (this.raO != null) {
        paramVarArgs.g(32, this.raO);
      }
      if (this.raN != null) {
        paramVarArgs.g(33, this.raN);
      }
      if (this.raM != null) {
        paramVarArgs.g(34, this.raM);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label2356;
      }
    }
    label2356:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.ssC != null) {
        paramInt = i + f.a.a.a.fS(2, this.ssC.boi());
      }
      i = paramInt;
      if (this.rcj != null) {
        i = paramInt + f.a.a.a.fS(3, this.rcj.boi());
      }
      paramInt = i;
      if (this.rck != null) {
        paramInt = i + f.a.a.a.fS(4, this.rck.boi());
      }
      i = paramInt + f.a.a.a.fQ(5, this.rdV) + f.a.a.a.fQ(6, this.rdW) + f.a.a.a.fQ(7, this.rdX);
      paramInt = i;
      if (this.rtW != null) {
        paramInt = i + f.a.a.a.fS(8, this.rtW.boi());
      }
      i = paramInt + f.a.a.a.fQ(9, this.jQd);
      paramInt = i;
      if (this.rco != null) {
        paramInt = i + f.a.a.b.b.a.h(10, this.rco);
      }
      i = paramInt + f.a.a.a.fQ(11, this.rJr) + f.a.a.a.fQ(12, this.rth) + f.a.a.a.fQ(13, this.soa);
      paramInt = i;
      if (this.rvP != null) {
        paramInt = i + f.a.a.b.b.a.h(14, this.rvP);
      }
      i = paramInt;
      if (this.ssD != null) {
        i = paramInt + f.a.a.b.b.a.h(15, this.ssD);
      }
      paramInt = i;
      if (this.ssE != null) {
        paramInt = i + f.a.a.b.b.a.h(16, this.ssE);
      }
      i = paramInt;
      if (this.rmy != null) {
        i = paramInt + f.a.a.b.b.a.h(17, this.rmy);
      }
      i = i + f.a.a.a.fQ(18, this.rmz) + f.a.a.a.fQ(19, this.ssF) + f.a.a.a.fQ(20, this.ssG);
      paramInt = i;
      if (this.ssH != null) {
        paramInt = i + f.a.a.b.b.a.h(21, this.ssH);
      }
      i = paramInt + f.a.a.a.fQ(22, this.ssI) + f.a.a.a.fQ(23, this.ssJ) + f.a.a.a.fQ(24, this.ssK);
      paramInt = i;
      if (this.rPR != null) {
        paramInt = i + f.a.a.b.b.a.h(25, this.rPR);
      }
      i = paramInt + f.a.a.a.fQ(26, this.rwB);
      paramInt = i;
      if (this.rwk != null) {
        paramInt = i + f.a.a.b.b.a.h(27, this.rwk);
      }
      i = paramInt + f.a.a.a.fQ(28, this.rmA) + f.a.a.a.fQ(29, this.rmB) + f.a.a.a.fQ(30, this.sjV);
      paramInt = i;
      if (this.jQb != null) {
        paramInt = i + f.a.a.b.b.a.h(31, this.jQb);
      }
      i = paramInt;
      if (this.raO != null) {
        i = paramInt + f.a.a.b.b.a.h(32, this.raO);
      }
      paramInt = i;
      if (this.raN != null) {
        paramInt = i + f.a.a.b.b.a.h(33, this.raN);
      }
      i = paramInt;
      if (this.raM != null) {
        i = paramInt + f.a.a.b.b.a.h(34, this.raM);
      }
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.ssC == null) {
          throw new b("Not all required fields were included: ClientImgId");
        }
        if (this.rcj == null) {
          throw new b("Not all required fields were included: FromUserName");
        }
        if (this.rck == null) {
          throw new b("Not all required fields were included: ToUserName");
        }
        if (this.rtW != null) {
          break;
        }
        throw new b("Not all required fields were included: Data");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bwi localbwi = (bwi)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new fk();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((fk)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbwi.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbwi.ssC = ((bhz)localObject1);
            paramInt += 1;
          }
        case 3: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbwi.rcj = ((bhz)localObject1);
            paramInt += 1;
          }
        case 4: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbwi.rck = ((bhz)localObject1);
            paramInt += 1;
          }
        case 5: 
          localbwi.rdV = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          localbwi.rdW = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localbwi.rdX = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 8: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbwi.rtW = ((bhy)localObject1);
            paramInt += 1;
          }
        case 9: 
          localbwi.jQd = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 10: 
          localbwi.rco = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 11: 
          localbwi.rJr = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 12: 
          localbwi.rth = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 13: 
          localbwi.soa = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 14: 
          localbwi.rvP = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 15: 
          localbwi.ssD = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 16: 
          localbwi.ssE = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 17: 
          localbwi.rmy = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 18: 
          localbwi.rmz = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 19: 
          localbwi.ssF = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 20: 
          localbwi.ssG = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 21: 
          localbwi.ssH = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 22: 
          localbwi.ssI = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 23: 
          localbwi.ssJ = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 24: 
          localbwi.ssK = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 25: 
          localbwi.rPR = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 26: 
          localbwi.rwB = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 27: 
          localbwi.rwk = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 28: 
          localbwi.rmA = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 29: 
          localbwi.rmB = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 30: 
          localbwi.sjV = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 31: 
          localbwi.jQb = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 32: 
          localbwi.raO = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 33: 
          localbwi.raN = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localbwi.raM = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bwi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */