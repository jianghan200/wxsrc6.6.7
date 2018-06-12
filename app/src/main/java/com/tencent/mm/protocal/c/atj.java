package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class atj
  extends com.tencent.mm.bk.a
{
  public int eJH;
  public String eJI;
  public String eJJ;
  public String eJK;
  public int eJL;
  public String eJQ;
  public bhz rQz;
  public int rTe;
  public String rTf;
  public int rWG;
  public bhz rWH;
  public bhz rWI;
  public bhz rWJ;
  public bhz ruT;
  public bhz ruU;
  public int rup;
  public bhz rvo;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rvo == null) {
        throw new b("Not all required fields were included: MemberName");
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
      if (this.rWH == null) {
        throw new b("Not all required fields were included: Remark");
      }
      if (this.rWI == null) {
        throw new b("Not all required fields were included: RemarkPYInitial");
      }
      if (this.rWJ == null) {
        throw new b("Not all required fields were included: RemarkQuanPin");
      }
      if (this.rvo != null)
      {
        paramVarArgs.fV(1, this.rvo.boi());
        this.rvo.a(paramVarArgs);
      }
      paramVarArgs.fT(2, this.rWG);
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
      if (this.rWH != null)
      {
        paramVarArgs.fV(9, this.rWH.boi());
        this.rWH.a(paramVarArgs);
      }
      if (this.rWI != null)
      {
        paramVarArgs.fV(10, this.rWI.boi());
        this.rWI.a(paramVarArgs);
      }
      if (this.rWJ != null)
      {
        paramVarArgs.fV(11, this.rWJ.boi());
        this.rWJ.a(paramVarArgs);
      }
      paramVarArgs.fT(12, this.rup);
      if (this.eJI != null) {
        paramVarArgs.g(13, this.eJI);
      }
      if (this.eJJ != null) {
        paramVarArgs.g(14, this.eJJ);
      }
      if (this.eJK != null) {
        paramVarArgs.g(15, this.eJK);
      }
      paramVarArgs.fT(16, this.eJL);
      paramVarArgs.fT(17, this.rTe);
      if (this.rTf != null) {
        paramVarArgs.g(18, this.rTf);
      }
      if (this.eJQ != null) {
        paramVarArgs.g(19, this.eJQ);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.rvo == null) {
        break label1893;
      }
    }
    label1893:
    for (paramInt = f.a.a.a.fS(1, this.rvo.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.rWG);
      paramInt = i;
      if (this.rQz != null) {
        paramInt = i + f.a.a.a.fS(3, this.rQz.boi());
      }
      i = paramInt;
      if (this.ruT != null) {
        i = paramInt + f.a.a.a.fS(4, this.ruT.boi());
      }
      paramInt = i;
      if (this.ruU != null) {
        paramInt = i + f.a.a.a.fS(5, this.ruU.boi());
      }
      i = paramInt + f.a.a.a.fQ(6, this.eJH);
      paramInt = i;
      if (this.rWH != null) {
        paramInt = i + f.a.a.a.fS(9, this.rWH.boi());
      }
      i = paramInt;
      if (this.rWI != null) {
        i = paramInt + f.a.a.a.fS(10, this.rWI.boi());
      }
      paramInt = i;
      if (this.rWJ != null) {
        paramInt = i + f.a.a.a.fS(11, this.rWJ.boi());
      }
      i = paramInt + f.a.a.a.fQ(12, this.rup);
      paramInt = i;
      if (this.eJI != null) {
        paramInt = i + f.a.a.b.b.a.h(13, this.eJI);
      }
      i = paramInt;
      if (this.eJJ != null) {
        i = paramInt + f.a.a.b.b.a.h(14, this.eJJ);
      }
      paramInt = i;
      if (this.eJK != null) {
        paramInt = i + f.a.a.b.b.a.h(15, this.eJK);
      }
      i = paramInt + f.a.a.a.fQ(16, this.eJL) + f.a.a.a.fQ(17, this.rTe);
      paramInt = i;
      if (this.rTf != null) {
        paramInt = i + f.a.a.b.b.a.h(18, this.rTf);
      }
      i = paramInt;
      if (this.eJQ != null) {
        i = paramInt + f.a.a.b.b.a.h(19, this.eJQ);
      }
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.rvo == null) {
          throw new b("Not all required fields were included: MemberName");
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
        if (this.rWH == null) {
          throw new b("Not all required fields were included: Remark");
        }
        if (this.rWI == null) {
          throw new b("Not all required fields were included: RemarkPYInitial");
        }
        if (this.rWJ != null) {
          break;
        }
        throw new b("Not all required fields were included: RemarkQuanPin");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        atj localatj = (atj)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        case 7: 
        case 8: 
        default: 
          return -1;
        case 1: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localatj.rvo = ((bhz)localObject1);
            paramInt += 1;
          }
        case 2: 
          localatj.rWG = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localatj.rQz = ((bhz)localObject1);
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
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localatj.ruT = ((bhz)localObject1);
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
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localatj.ruU = ((bhz)localObject1);
            paramInt += 1;
          }
        case 6: 
          localatj.eJH = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 9: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localatj.rWH = ((bhz)localObject1);
            paramInt += 1;
          }
        case 10: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localatj.rWI = ((bhz)localObject1);
            paramInt += 1;
          }
        case 11: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localatj.rWJ = ((bhz)localObject1);
            paramInt += 1;
          }
        case 12: 
          localatj.rup = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 13: 
          localatj.eJI = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 14: 
          localatj.eJJ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 15: 
          localatj.eJK = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 16: 
          localatj.eJL = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 17: 
          localatj.rTe = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 18: 
          localatj.rTf = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localatj.eJQ = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/atj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */