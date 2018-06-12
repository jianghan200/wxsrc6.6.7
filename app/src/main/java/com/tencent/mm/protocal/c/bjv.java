package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class bjv
  extends com.tencent.mm.bk.a
{
  public int eJH;
  public String eJI;
  public String eJJ;
  public String eJK;
  public int eJL;
  public String eJM;
  public String eJQ;
  public bhz rQz;
  public int rTe;
  public String rTf;
  public String rTg;
  public String rTh;
  public int rTi;
  public String rqZ;
  public String rra;
  public bhz rvi;
  public qu sjI;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rvi == null) {
        throw new b("Not all required fields were included: UserName");
      }
      if (this.rQz == null) {
        throw new b("Not all required fields were included: NickName");
      }
      if (this.rvi != null)
      {
        paramVarArgs.fV(1, this.rvi.boi());
        this.rvi.a(paramVarArgs);
      }
      if (this.rQz != null)
      {
        paramVarArgs.fV(2, this.rQz.boi());
        this.rQz.a(paramVarArgs);
      }
      paramVarArgs.fT(3, this.eJH);
      if (this.eJI != null) {
        paramVarArgs.g(4, this.eJI);
      }
      if (this.eJJ != null) {
        paramVarArgs.g(5, this.eJJ);
      }
      if (this.eJK != null) {
        paramVarArgs.g(6, this.eJK);
      }
      paramVarArgs.fT(7, this.eJL);
      paramVarArgs.fT(8, this.rTe);
      if (this.rTf != null) {
        paramVarArgs.g(9, this.rTf);
      }
      if (this.rTg != null) {
        paramVarArgs.g(10, this.rTg);
      }
      if (this.eJM != null) {
        paramVarArgs.g(11, this.eJM);
      }
      if (this.rTh != null) {
        paramVarArgs.g(12, this.rTh);
      }
      paramVarArgs.fT(13, this.rTi);
      if (this.eJQ != null) {
        paramVarArgs.g(14, this.eJQ);
      }
      if (this.sjI != null)
      {
        paramVarArgs.fV(15, this.sjI.boi());
        this.sjI.a(paramVarArgs);
      }
      if (this.rqZ != null) {
        paramVarArgs.g(16, this.rqZ);
      }
      if (this.rra != null) {
        paramVarArgs.g(17, this.rra);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.rvi == null) {
        break label1361;
      }
    }
    label1361:
    for (paramInt = f.a.a.a.fS(1, this.rvi.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.rQz != null) {
        i = paramInt + f.a.a.a.fS(2, this.rQz.boi());
      }
      i += f.a.a.a.fQ(3, this.eJH);
      paramInt = i;
      if (this.eJI != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.eJI);
      }
      i = paramInt;
      if (this.eJJ != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.eJJ);
      }
      paramInt = i;
      if (this.eJK != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.eJK);
      }
      i = paramInt + f.a.a.a.fQ(7, this.eJL) + f.a.a.a.fQ(8, this.rTe);
      paramInt = i;
      if (this.rTf != null) {
        paramInt = i + f.a.a.b.b.a.h(9, this.rTf);
      }
      i = paramInt;
      if (this.rTg != null) {
        i = paramInt + f.a.a.b.b.a.h(10, this.rTg);
      }
      paramInt = i;
      if (this.eJM != null) {
        paramInt = i + f.a.a.b.b.a.h(11, this.eJM);
      }
      i = paramInt;
      if (this.rTh != null) {
        i = paramInt + f.a.a.b.b.a.h(12, this.rTh);
      }
      i += f.a.a.a.fQ(13, this.rTi);
      paramInt = i;
      if (this.eJQ != null) {
        paramInt = i + f.a.a.b.b.a.h(14, this.eJQ);
      }
      i = paramInt;
      if (this.sjI != null) {
        i = paramInt + f.a.a.a.fS(15, this.sjI.boi());
      }
      paramInt = i;
      if (this.rqZ != null) {
        paramInt = i + f.a.a.b.b.a.h(16, this.rqZ);
      }
      i = paramInt;
      if (this.rra != null) {
        i = paramInt + f.a.a.b.b.a.h(17, this.rra);
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
        if (this.rvi == null) {
          throw new b("Not all required fields were included: UserName");
        }
        if (this.rQz != null) {
          break;
        }
        throw new b("Not all required fields were included: NickName");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bjv localbjv = (bjv)paramVarArgs[1];
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
            localObject1 = new bhz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localbjv.rvi = ((bhz)localObject1);
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
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localbjv.rQz = ((bhz)localObject1);
            paramInt += 1;
          }
        case 3: 
          localbjv.eJH = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localbjv.eJI = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localbjv.eJJ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localbjv.eJK = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localbjv.eJL = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 8: 
          localbjv.rTe = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 9: 
          localbjv.rTf = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 10: 
          localbjv.rTg = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 11: 
          localbjv.eJM = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 12: 
          localbjv.rTh = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 13: 
          localbjv.rTi = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 14: 
          localbjv.eJQ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 15: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new qu();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((qu)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localbjv.sjI = ((qu)localObject1);
            paramInt += 1;
          }
        case 16: 
          localbjv.rqZ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localbjv.rra = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/bjv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */