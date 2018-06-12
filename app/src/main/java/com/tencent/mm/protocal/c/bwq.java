package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class bwq
  extends bhd
{
  public String jTu;
  public String jTv;
  public String rPP;
  public String rPR;
  public int rVp;
  public int rVq;
  public bhy rVr;
  public int rVs;
  public String rco;
  public String rdo;
  public int rdq;
  public int rmA;
  public int rmB;
  public String rmy;
  public int rmz;
  public int rvT;
  public int rwB;
  public int sjV;
  public int slf;
  public int ssI;
  public int ssJ;
  public int ssK;
  public int ssQ;
  public int ssR;
  public bhy ssS;
  public int ssT;
  public String ssU;
  public int ssV;
  public String ssW;
  public String ssX;
  public int ssY;
  public String ssZ;
  public String sta;
  public String stb;
  public String stc;
  public String std;
  public String ste;
  public String stf;
  public String stg;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rVr == null) {
        throw new b("Not all required fields were included: ThumbData");
      }
      if (this.ssS == null) {
        throw new b("Not all required fields were included: VideoData");
      }
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      if (this.rdo != null) {
        paramVarArgs.g(2, this.rdo);
      }
      if (this.jTv != null) {
        paramVarArgs.g(3, this.jTv);
      }
      if (this.jTu != null) {
        paramVarArgs.g(4, this.jTu);
      }
      paramVarArgs.fT(5, this.rVp);
      paramVarArgs.fT(6, this.rVq);
      if (this.rVr != null)
      {
        paramVarArgs.fV(7, this.rVr.boi());
        this.rVr.a(paramVarArgs);
      }
      paramVarArgs.fT(8, this.ssQ);
      paramVarArgs.fT(9, this.ssR);
      if (this.ssS != null)
      {
        paramVarArgs.fV(10, this.ssS.boi());
        this.ssS.a(paramVarArgs);
      }
      paramVarArgs.fT(11, this.slf);
      paramVarArgs.fT(12, this.rvT);
      paramVarArgs.fT(13, this.rVs);
      paramVarArgs.fT(14, this.ssT);
      if (this.rco != null) {
        paramVarArgs.g(15, this.rco);
      }
      if (this.ssU != null) {
        paramVarArgs.g(16, this.ssU);
      }
      if (this.rmy != null) {
        paramVarArgs.g(17, this.rmy);
      }
      paramVarArgs.fT(18, this.rmz);
      if (this.rPP != null) {
        paramVarArgs.g(19, this.rPP);
      }
      paramVarArgs.fT(20, this.ssI);
      paramVarArgs.fT(21, this.ssJ);
      paramVarArgs.fT(22, this.ssK);
      if (this.rPR != null) {
        paramVarArgs.g(23, this.rPR);
      }
      paramVarArgs.fT(24, this.ssV);
      paramVarArgs.fT(25, this.rwB);
      if (this.ssW != null) {
        paramVarArgs.g(26, this.ssW);
      }
      if (this.ssX != null) {
        paramVarArgs.g(27, this.ssX);
      }
      paramVarArgs.fT(28, this.ssY);
      if (this.ssZ != null) {
        paramVarArgs.g(29, this.ssZ);
      }
      if (this.sta != null) {
        paramVarArgs.g(30, this.sta);
      }
      if (this.stb != null) {
        paramVarArgs.g(31, this.stb);
      }
      if (this.stc != null) {
        paramVarArgs.g(32, this.stc);
      }
      if (this.std != null) {
        paramVarArgs.g(33, this.std);
      }
      if (this.ste != null) {
        paramVarArgs.g(34, this.ste);
      }
      if (this.stf != null) {
        paramVarArgs.g(35, this.stf);
      }
      paramVarArgs.fT(36, this.sjV);
      if (this.stg != null) {
        paramVarArgs.g(37, this.stg);
      }
      paramVarArgs.fT(38, this.rmA);
      paramVarArgs.fT(39, this.rmB);
      paramVarArgs.fT(40, this.rdq);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label2414;
      }
    }
    label2414:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rdo != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.rdo);
      }
      i = paramInt;
      if (this.jTv != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.jTv);
      }
      paramInt = i;
      if (this.jTu != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.jTu);
      }
      i = paramInt + f.a.a.a.fQ(5, this.rVp) + f.a.a.a.fQ(6, this.rVq);
      paramInt = i;
      if (this.rVr != null) {
        paramInt = i + f.a.a.a.fS(7, this.rVr.boi());
      }
      i = paramInt + f.a.a.a.fQ(8, this.ssQ) + f.a.a.a.fQ(9, this.ssR);
      paramInt = i;
      if (this.ssS != null) {
        paramInt = i + f.a.a.a.fS(10, this.ssS.boi());
      }
      i = paramInt + f.a.a.a.fQ(11, this.slf) + f.a.a.a.fQ(12, this.rvT) + f.a.a.a.fQ(13, this.rVs) + f.a.a.a.fQ(14, this.ssT);
      paramInt = i;
      if (this.rco != null) {
        paramInt = i + f.a.a.b.b.a.h(15, this.rco);
      }
      i = paramInt;
      if (this.ssU != null) {
        i = paramInt + f.a.a.b.b.a.h(16, this.ssU);
      }
      paramInt = i;
      if (this.rmy != null) {
        paramInt = i + f.a.a.b.b.a.h(17, this.rmy);
      }
      i = paramInt + f.a.a.a.fQ(18, this.rmz);
      paramInt = i;
      if (this.rPP != null) {
        paramInt = i + f.a.a.b.b.a.h(19, this.rPP);
      }
      i = paramInt + f.a.a.a.fQ(20, this.ssI) + f.a.a.a.fQ(21, this.ssJ) + f.a.a.a.fQ(22, this.ssK);
      paramInt = i;
      if (this.rPR != null) {
        paramInt = i + f.a.a.b.b.a.h(23, this.rPR);
      }
      i = paramInt + f.a.a.a.fQ(24, this.ssV) + f.a.a.a.fQ(25, this.rwB);
      paramInt = i;
      if (this.ssW != null) {
        paramInt = i + f.a.a.b.b.a.h(26, this.ssW);
      }
      i = paramInt;
      if (this.ssX != null) {
        i = paramInt + f.a.a.b.b.a.h(27, this.ssX);
      }
      i += f.a.a.a.fQ(28, this.ssY);
      paramInt = i;
      if (this.ssZ != null) {
        paramInt = i + f.a.a.b.b.a.h(29, this.ssZ);
      }
      i = paramInt;
      if (this.sta != null) {
        i = paramInt + f.a.a.b.b.a.h(30, this.sta);
      }
      paramInt = i;
      if (this.stb != null) {
        paramInt = i + f.a.a.b.b.a.h(31, this.stb);
      }
      i = paramInt;
      if (this.stc != null) {
        i = paramInt + f.a.a.b.b.a.h(32, this.stc);
      }
      paramInt = i;
      if (this.std != null) {
        paramInt = i + f.a.a.b.b.a.h(33, this.std);
      }
      i = paramInt;
      if (this.ste != null) {
        i = paramInt + f.a.a.b.b.a.h(34, this.ste);
      }
      paramInt = i;
      if (this.stf != null) {
        paramInt = i + f.a.a.b.b.a.h(35, this.stf);
      }
      i = paramInt + f.a.a.a.fQ(36, this.sjV);
      paramInt = i;
      if (this.stg != null) {
        paramInt = i + f.a.a.b.b.a.h(37, this.stg);
      }
      return paramInt + f.a.a.a.fQ(38, this.rmA) + f.a.a.a.fQ(39, this.rmB) + f.a.a.a.fQ(40, this.rdq);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.rVr == null) {
          throw new b("Not all required fields were included: ThumbData");
        }
        if (this.ssS != null) {
          break;
        }
        throw new b("Not all required fields were included: VideoData");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bwq localbwq = (bwq)paramVarArgs[1];
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
            localbwq.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbwq.rdo = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localbwq.jTv = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localbwq.jTu = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localbwq.rVp = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          localbwq.rVq = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbwq.rVr = ((bhy)localObject1);
            paramInt += 1;
          }
        case 8: 
          localbwq.ssQ = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 9: 
          localbwq.ssR = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 10: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbwq.ssS = ((bhy)localObject1);
            paramInt += 1;
          }
        case 11: 
          localbwq.slf = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 12: 
          localbwq.rvT = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 13: 
          localbwq.rVs = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 14: 
          localbwq.ssT = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 15: 
          localbwq.rco = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 16: 
          localbwq.ssU = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 17: 
          localbwq.rmy = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 18: 
          localbwq.rmz = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 19: 
          localbwq.rPP = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 20: 
          localbwq.ssI = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 21: 
          localbwq.ssJ = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 22: 
          localbwq.ssK = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 23: 
          localbwq.rPR = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 24: 
          localbwq.ssV = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 25: 
          localbwq.rwB = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 26: 
          localbwq.ssW = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 27: 
          localbwq.ssX = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 28: 
          localbwq.ssY = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 29: 
          localbwq.ssZ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 30: 
          localbwq.sta = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 31: 
          localbwq.stb = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 32: 
          localbwq.stc = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 33: 
          localbwq.std = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 34: 
          localbwq.ste = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 35: 
          localbwq.stf = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 36: 
          localbwq.sjV = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 37: 
          localbwq.stg = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 38: 
          localbwq.rmA = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 39: 
          localbwq.rmB = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localbwq.rdq = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bwq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */