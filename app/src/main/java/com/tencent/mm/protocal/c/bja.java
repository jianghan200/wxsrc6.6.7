package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class bja
  extends bhp
{
  public int eJH;
  public String eJI;
  public String eJJ;
  public String eJK;
  public int eJL;
  public String eJM;
  public int eJN;
  public int eJO;
  public String eJP;
  public String eJQ;
  public String eJR;
  public String rEJ;
  public int rHb;
  public LinkedList<biy> rHc = new LinkedList();
  public bhz rQz;
  public int rTe;
  public String rTf;
  public String rTg;
  public String rTh;
  public int rTi;
  public bqd rTk;
  public qt rTl;
  public bhy rcn;
  public String rqZ;
  public String rra;
  public bhz ruT;
  public bhz ruU;
  public bhz rvi;
  public int sjj;
  public bhy sjl;
  public String sjm;
  public String sjn;
  public int sjo;
  public LinkedList<bjp> sjp = new LinkedList();
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.six == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.rvi == null) {
        throw new b("Not all required fields were included: UserName");
      }
      if (this.rQz == null) {
        throw new b("Not all required fields were included: NickName");
      }
      if (this.ruT == null) {
        throw new b("Not all required fields were included: PYInitial");
      }
      if (this.ruU == null) {
        throw new b("Not all required fields were included: QuanPin");
      }
      if (this.rcn == null) {
        throw new b("Not all required fields were included: ImgBuf");
      }
      if (this.six != null)
      {
        paramVarArgs.fV(1, this.six.boi());
        this.six.a(paramVarArgs);
      }
      if (this.rvi != null)
      {
        paramVarArgs.fV(2, this.rvi.boi());
        this.rvi.a(paramVarArgs);
      }
      if (this.rQz != null)
      {
        paramVarArgs.fV(3, this.rQz.boi());
        this.rQz.a(paramVarArgs);
      }
      if (this.ruT != null)
      {
        paramVarArgs.fV(4, this.ruT.boi());
        this.ruT.a(paramVarArgs);
      }
      if (this.ruU != null)
      {
        paramVarArgs.fV(5, this.ruU.boi());
        this.ruU.a(paramVarArgs);
      }
      paramVarArgs.fT(6, this.eJH);
      if (this.rcn != null)
      {
        paramVarArgs.fV(7, this.rcn.boi());
        this.rcn.a(paramVarArgs);
      }
      if (this.eJI != null) {
        paramVarArgs.g(8, this.eJI);
      }
      if (this.eJJ != null) {
        paramVarArgs.g(9, this.eJJ);
      }
      if (this.eJK != null) {
        paramVarArgs.g(10, this.eJK);
      }
      paramVarArgs.fT(11, this.eJL);
      paramVarArgs.fT(12, this.rTe);
      if (this.rTf != null) {
        paramVarArgs.g(13, this.rTf);
      }
      if (this.rTg != null) {
        paramVarArgs.g(14, this.rTg);
      }
      if (this.eJM != null) {
        paramVarArgs.g(15, this.eJM);
      }
      if (this.rTh != null) {
        paramVarArgs.g(16, this.rTh);
      }
      paramVarArgs.fT(17, this.rTi);
      paramVarArgs.fT(18, this.eJO);
      paramVarArgs.fT(19, this.eJN);
      if (this.eJP != null) {
        paramVarArgs.g(20, this.eJP);
      }
      if (this.rTk != null)
      {
        paramVarArgs.fV(21, this.rTk.boi());
        this.rTk.a(paramVarArgs);
      }
      if (this.eJQ != null) {
        paramVarArgs.g(22, this.eJQ);
      }
      if (this.eJR != null) {
        paramVarArgs.g(23, this.eJR);
      }
      if (this.rTl != null)
      {
        paramVarArgs.fV(24, this.rTl.boi());
        this.rTl.a(paramVarArgs);
      }
      paramVarArgs.fT(25, this.rHb);
      paramVarArgs.d(26, 8, this.rHc);
      if (this.rqZ != null) {
        paramVarArgs.g(27, this.rqZ);
      }
      if (this.rra != null) {
        paramVarArgs.g(28, this.rra);
      }
      if (this.sjl != null)
      {
        paramVarArgs.fV(29, this.sjl.boi());
        this.sjl.a(paramVarArgs);
      }
      if (this.rEJ != null) {
        paramVarArgs.g(30, this.rEJ);
      }
      if (this.sjm != null) {
        paramVarArgs.g(31, this.sjm);
      }
      paramVarArgs.fT(32, this.sjj);
      if (this.sjn != null) {
        paramVarArgs.g(33, this.sjn);
      }
      paramVarArgs.fT(34, this.sjo);
      paramVarArgs.d(35, 8, this.sjp);
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label3143;
      }
    }
    label3143:
    for (int i = f.a.a.a.fS(1, this.six.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rvi != null) {
        paramInt = i + f.a.a.a.fS(2, this.rvi.boi());
      }
      i = paramInt;
      if (this.rQz != null) {
        i = paramInt + f.a.a.a.fS(3, this.rQz.boi());
      }
      paramInt = i;
      if (this.ruT != null) {
        paramInt = i + f.a.a.a.fS(4, this.ruT.boi());
      }
      i = paramInt;
      if (this.ruU != null) {
        i = paramInt + f.a.a.a.fS(5, this.ruU.boi());
      }
      i += f.a.a.a.fQ(6, this.eJH);
      paramInt = i;
      if (this.rcn != null) {
        paramInt = i + f.a.a.a.fS(7, this.rcn.boi());
      }
      i = paramInt;
      if (this.eJI != null) {
        i = paramInt + f.a.a.b.b.a.h(8, this.eJI);
      }
      paramInt = i;
      if (this.eJJ != null) {
        paramInt = i + f.a.a.b.b.a.h(9, this.eJJ);
      }
      i = paramInt;
      if (this.eJK != null) {
        i = paramInt + f.a.a.b.b.a.h(10, this.eJK);
      }
      i = i + f.a.a.a.fQ(11, this.eJL) + f.a.a.a.fQ(12, this.rTe);
      paramInt = i;
      if (this.rTf != null) {
        paramInt = i + f.a.a.b.b.a.h(13, this.rTf);
      }
      i = paramInt;
      if (this.rTg != null) {
        i = paramInt + f.a.a.b.b.a.h(14, this.rTg);
      }
      paramInt = i;
      if (this.eJM != null) {
        paramInt = i + f.a.a.b.b.a.h(15, this.eJM);
      }
      i = paramInt;
      if (this.rTh != null) {
        i = paramInt + f.a.a.b.b.a.h(16, this.rTh);
      }
      i = i + f.a.a.a.fQ(17, this.rTi) + f.a.a.a.fQ(18, this.eJO) + f.a.a.a.fQ(19, this.eJN);
      paramInt = i;
      if (this.eJP != null) {
        paramInt = i + f.a.a.b.b.a.h(20, this.eJP);
      }
      i = paramInt;
      if (this.rTk != null) {
        i = paramInt + f.a.a.a.fS(21, this.rTk.boi());
      }
      paramInt = i;
      if (this.eJQ != null) {
        paramInt = i + f.a.a.b.b.a.h(22, this.eJQ);
      }
      i = paramInt;
      if (this.eJR != null) {
        i = paramInt + f.a.a.b.b.a.h(23, this.eJR);
      }
      paramInt = i;
      if (this.rTl != null) {
        paramInt = i + f.a.a.a.fS(24, this.rTl.boi());
      }
      i = paramInt + f.a.a.a.fQ(25, this.rHb) + f.a.a.a.c(26, 8, this.rHc);
      paramInt = i;
      if (this.rqZ != null) {
        paramInt = i + f.a.a.b.b.a.h(27, this.rqZ);
      }
      i = paramInt;
      if (this.rra != null) {
        i = paramInt + f.a.a.b.b.a.h(28, this.rra);
      }
      paramInt = i;
      if (this.sjl != null) {
        paramInt = i + f.a.a.a.fS(29, this.sjl.boi());
      }
      i = paramInt;
      if (this.rEJ != null) {
        i = paramInt + f.a.a.b.b.a.h(30, this.rEJ);
      }
      paramInt = i;
      if (this.sjm != null) {
        paramInt = i + f.a.a.b.b.a.h(31, this.sjm);
      }
      i = paramInt + f.a.a.a.fQ(32, this.sjj);
      paramInt = i;
      if (this.sjn != null) {
        paramInt = i + f.a.a.b.b.a.h(33, this.sjn);
      }
      return paramInt + f.a.a.a.fQ(34, this.sjo) + f.a.a.a.c(35, 8, this.sjp);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rHc.clear();
        this.sjp.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = bhp.a(paramVarArgs); paramInt > 0; paramInt = bhp.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.six == null) {
          throw new b("Not all required fields were included: BaseResponse");
        }
        if (this.rvi == null) {
          throw new b("Not all required fields were included: UserName");
        }
        if (this.rQz == null) {
          throw new b("Not all required fields were included: NickName");
        }
        if (this.ruT == null) {
          throw new b("Not all required fields were included: PYInitial");
        }
        if (this.ruU == null) {
          throw new b("Not all required fields were included: QuanPin");
        }
        if (this.rcn != null) {
          break;
        }
        throw new b("Not all required fields were included: ImgBuf");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bja localbja = (bja)paramVarArgs[1];
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
            localObject1 = new fl();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((fl)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbja.six = ((fl)localObject1);
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
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbja.rvi = ((bhz)localObject1);
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
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbja.rQz = ((bhz)localObject1);
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
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbja.ruT = ((bhz)localObject1);
            paramInt += 1;
          }
        case 5: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbja.ruU = ((bhz)localObject1);
            paramInt += 1;
          }
        case 6: 
          localbja.eJH = ((f.a.a.a.a)localObject1).vHC.rY();
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
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbja.rcn = ((bhy)localObject1);
            paramInt += 1;
          }
        case 8: 
          localbja.eJI = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 9: 
          localbja.eJJ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 10: 
          localbja.eJK = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 11: 
          localbja.eJL = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 12: 
          localbja.rTe = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 13: 
          localbja.rTf = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 14: 
          localbja.rTg = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 15: 
          localbja.eJM = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 16: 
          localbja.rTh = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 17: 
          localbja.rTi = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 18: 
          localbja.eJO = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 19: 
          localbja.eJN = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 20: 
          localbja.eJP = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 21: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bqd();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bqd)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbja.rTk = ((bqd)localObject1);
            paramInt += 1;
          }
        case 22: 
          localbja.eJQ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 23: 
          localbja.eJR = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 24: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new qt();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((qt)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbja.rTl = ((qt)localObject1);
            paramInt += 1;
          }
        case 25: 
          localbja.rHb = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 26: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new biy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((biy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbja.rHc.add(localObject1);
            paramInt += 1;
          }
        case 27: 
          localbja.rqZ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 28: 
          localbja.rra = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 29: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbja.sjl = ((bhy)localObject1);
            paramInt += 1;
          }
        case 30: 
          localbja.rEJ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 31: 
          localbja.sjm = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 32: 
          localbja.sjj = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 33: 
          localbja.sjn = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 34: 
          localbja.sjo = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bjp();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bjp)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
          localbja.sjp.add(localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/bja.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */