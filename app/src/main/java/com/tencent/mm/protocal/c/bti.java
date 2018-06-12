package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class bti
  extends com.tencent.mm.bk.a
{
  public long bHu;
  public boolean bIq;
  public String bhd;
  public int dwI;
  public int dwJ;
  public String ixy;
  public String ixz;
  public String lRt;
  public String nzH;
  public String pLA;
  public String pLw;
  public String pLx;
  public String pLy;
  public String pLz;
  public LinkedList<bnq> rBV = new LinkedList();
  public String sqQ;
  public int sqR;
  public String sqS;
  public long sqT;
  public String sqU;
  public String sqV;
  public int sqW;
  public String sqX;
  public String sqY;
  public String sqZ;
  public long sra;
  public long srb;
  public LinkedList<String> srd = new LinkedList();
  public LinkedList<xe> sre = new LinkedList();
  public long timestamp;
  public String title;
  public String videoUrl;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.title != null) {
        paramVarArgs.g(1, this.title);
      }
      if (this.videoUrl != null) {
        paramVarArgs.g(2, this.videoUrl);
      }
      if (this.sqQ != null) {
        paramVarArgs.g(3, this.sqQ);
      }
      paramVarArgs.fT(4, this.sqR);
      if (this.sqS != null) {
        paramVarArgs.g(5, this.sqS);
      }
      paramVarArgs.fT(6, this.dwJ);
      paramVarArgs.fT(7, this.dwI);
      if (this.ixy != null) {
        paramVarArgs.g(8, this.ixy);
      }
      if (this.ixz != null) {
        paramVarArgs.g(9, this.ixz);
      }
      if (this.nzH != null) {
        paramVarArgs.g(10, this.nzH);
      }
      if (this.pLw != null) {
        paramVarArgs.g(11, this.pLw);
      }
      if (this.pLx != null) {
        paramVarArgs.g(12, this.pLx);
      }
      if (this.pLy != null) {
        paramVarArgs.g(13, this.pLy);
      }
      if (this.bhd != null) {
        paramVarArgs.g(14, this.bhd);
      }
      if (this.lRt != null) {
        paramVarArgs.g(15, this.lRt);
      }
      paramVarArgs.T(16, this.sqT);
      if (this.sqU != null) {
        paramVarArgs.g(17, this.sqU);
      }
      if (this.sqV != null) {
        paramVarArgs.g(18, this.sqV);
      }
      if (this.pLz != null) {
        paramVarArgs.g(19, this.pLz);
      }
      if (this.pLA != null) {
        paramVarArgs.g(20, this.pLA);
      }
      paramVarArgs.fT(21, this.sqW);
      if (this.sqX != null) {
        paramVarArgs.g(22, this.sqX);
      }
      if (this.sqY != null) {
        paramVarArgs.g(23, this.sqY);
      }
      paramVarArgs.d(24, 8, this.rBV);
      paramVarArgs.T(25, this.timestamp);
      paramVarArgs.av(26, this.bIq);
      if (this.sqZ != null) {
        paramVarArgs.g(27, this.sqZ);
      }
      paramVarArgs.T(28, this.sra);
      paramVarArgs.T(29, this.bHu);
      paramVarArgs.T(30, this.srb);
      paramVarArgs.d(31, 1, this.srd);
      paramVarArgs.d(32, 8, this.sre);
      return 0;
    }
    if (paramInt == 1) {
      if (this.title == null) {
        break label1909;
      }
    }
    label1909:
    for (int i = f.a.a.b.b.a.h(1, this.title) + 0;; i = 0)
    {
      paramInt = i;
      if (this.videoUrl != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.videoUrl);
      }
      i = paramInt;
      if (this.sqQ != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.sqQ);
      }
      i += f.a.a.a.fQ(4, this.sqR);
      paramInt = i;
      if (this.sqS != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.sqS);
      }
      i = paramInt + f.a.a.a.fQ(6, this.dwJ) + f.a.a.a.fQ(7, this.dwI);
      paramInt = i;
      if (this.ixy != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.ixy);
      }
      i = paramInt;
      if (this.ixz != null) {
        i = paramInt + f.a.a.b.b.a.h(9, this.ixz);
      }
      paramInt = i;
      if (this.nzH != null) {
        paramInt = i + f.a.a.b.b.a.h(10, this.nzH);
      }
      i = paramInt;
      if (this.pLw != null) {
        i = paramInt + f.a.a.b.b.a.h(11, this.pLw);
      }
      paramInt = i;
      if (this.pLx != null) {
        paramInt = i + f.a.a.b.b.a.h(12, this.pLx);
      }
      i = paramInt;
      if (this.pLy != null) {
        i = paramInt + f.a.a.b.b.a.h(13, this.pLy);
      }
      paramInt = i;
      if (this.bhd != null) {
        paramInt = i + f.a.a.b.b.a.h(14, this.bhd);
      }
      i = paramInt;
      if (this.lRt != null) {
        i = paramInt + f.a.a.b.b.a.h(15, this.lRt);
      }
      i += f.a.a.a.S(16, this.sqT);
      paramInt = i;
      if (this.sqU != null) {
        paramInt = i + f.a.a.b.b.a.h(17, this.sqU);
      }
      i = paramInt;
      if (this.sqV != null) {
        i = paramInt + f.a.a.b.b.a.h(18, this.sqV);
      }
      paramInt = i;
      if (this.pLz != null) {
        paramInt = i + f.a.a.b.b.a.h(19, this.pLz);
      }
      i = paramInt;
      if (this.pLA != null) {
        i = paramInt + f.a.a.b.b.a.h(20, this.pLA);
      }
      i += f.a.a.a.fQ(21, this.sqW);
      paramInt = i;
      if (this.sqX != null) {
        paramInt = i + f.a.a.b.b.a.h(22, this.sqX);
      }
      i = paramInt;
      if (this.sqY != null) {
        i = paramInt + f.a.a.b.b.a.h(23, this.sqY);
      }
      i = i + f.a.a.a.c(24, 8, this.rBV) + f.a.a.a.S(25, this.timestamp) + (f.a.a.b.b.a.ec(26) + 1);
      paramInt = i;
      if (this.sqZ != null) {
        paramInt = i + f.a.a.b.b.a.h(27, this.sqZ);
      }
      return paramInt + f.a.a.a.S(28, this.sra) + f.a.a.a.S(29, this.bHu) + f.a.a.a.S(30, this.srb) + f.a.a.a.c(31, 1, this.srd) + f.a.a.a.c(32, 8, this.sre);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rBV.clear();
        this.srd.clear();
        this.sre.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bti localbti = (bti)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          localbti.title = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          localbti.videoUrl = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localbti.sqQ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localbti.sqR = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localbti.sqS = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localbti.dwJ = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localbti.dwI = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 8: 
          localbti.ixy = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 9: 
          localbti.ixz = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 10: 
          localbti.nzH = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 11: 
          localbti.pLw = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 12: 
          localbti.pLx = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 13: 
          localbti.pLy = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 14: 
          localbti.bhd = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 15: 
          localbti.lRt = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 16: 
          localbti.sqT = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 17: 
          localbti.sqU = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 18: 
          localbti.sqV = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 19: 
          localbti.pLz = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 20: 
          localbti.pLA = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 21: 
          localbti.sqW = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 22: 
          localbti.sqX = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 23: 
          localbti.sqY = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 24: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bnq();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bnq)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localbti.rBV.add(localObject1);
            paramInt += 1;
          }
        case 25: 
          localbti.timestamp = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 26: 
          localbti.bIq = ((f.a.a.a.a)localObject1).cJQ();
          return 0;
        case 27: 
          localbti.sqZ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 28: 
          localbti.sra = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 29: 
          localbti.bHu = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 30: 
          localbti.srb = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 31: 
          localbti.srd.add(((f.a.a.a.a)localObject1).vHC.readString());
          return 0;
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new xe();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((xe)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localbti.sre.add(localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/bti.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */