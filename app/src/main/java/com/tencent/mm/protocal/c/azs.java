package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class azs
  extends bhp
{
  public int bMH;
  public String bMI;
  public int kYc;
  public String pru;
  public ccv scl;
  public ccs scm;
  public ccp scn;
  public cct sco;
  public boolean scp;
  public LinkedList<String> scq = new LinkedList();
  public ccr scr;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.six == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.six != null)
      {
        paramVarArgs.fV(1, this.six.boi());
        this.six.a(paramVarArgs);
      }
      paramVarArgs.fT(2, this.bMH);
      if (this.bMI != null) {
        paramVarArgs.g(3, this.bMI);
      }
      if (this.scl != null)
      {
        paramVarArgs.fV(4, this.scl.boi());
        this.scl.a(paramVarArgs);
      }
      if (this.scm != null)
      {
        paramVarArgs.fV(5, this.scm.boi());
        this.scm.a(paramVarArgs);
      }
      if (this.scn != null)
      {
        paramVarArgs.fV(6, this.scn.boi());
        this.scn.a(paramVarArgs);
      }
      if (this.sco != null)
      {
        paramVarArgs.fV(7, this.sco.boi());
        this.sco.a(paramVarArgs);
      }
      paramVarArgs.fT(8, this.kYc);
      paramVarArgs.av(9, this.scp);
      if (this.pru != null) {
        paramVarArgs.g(10, this.pru);
      }
      paramVarArgs.d(11, 1, this.scq);
      if (this.scr != null)
      {
        paramVarArgs.fV(12, this.scr.boi());
        this.scr.a(paramVarArgs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label1329;
      }
    }
    label1329:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.bMH);
      paramInt = i;
      if (this.bMI != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.bMI);
      }
      i = paramInt;
      if (this.scl != null) {
        i = paramInt + f.a.a.a.fS(4, this.scl.boi());
      }
      paramInt = i;
      if (this.scm != null) {
        paramInt = i + f.a.a.a.fS(5, this.scm.boi());
      }
      i = paramInt;
      if (this.scn != null) {
        i = paramInt + f.a.a.a.fS(6, this.scn.boi());
      }
      paramInt = i;
      if (this.sco != null) {
        paramInt = i + f.a.a.a.fS(7, this.sco.boi());
      }
      i = paramInt + f.a.a.a.fQ(8, this.kYc) + (f.a.a.b.b.a.ec(9) + 1);
      paramInt = i;
      if (this.pru != null) {
        paramInt = i + f.a.a.b.b.a.h(10, this.pru);
      }
      i = paramInt + f.a.a.a.c(11, 1, this.scq);
      paramInt = i;
      if (this.scr != null) {
        paramInt = i + f.a.a.a.fS(12, this.scr.boi());
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.scq.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = bhp.a(paramVarArgs); paramInt > 0; paramInt = bhp.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.six != null) {
          break;
        }
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        azs localazs = (azs)paramVarArgs[1];
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
            localazs.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localazs.bMH = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localazs.bMI = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new ccv();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ccv)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localazs.scl = ((ccv)localObject1);
            paramInt += 1;
          }
        case 5: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new ccs();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ccs)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localazs.scm = ((ccs)localObject1);
            paramInt += 1;
          }
        case 6: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new ccp();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ccp)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localazs.scn = ((ccp)localObject1);
            paramInt += 1;
          }
        case 7: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new cct();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cct)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localazs.sco = ((cct)localObject1);
            paramInt += 1;
          }
        case 8: 
          localazs.kYc = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 9: 
          localazs.scp = ((f.a.a.a.a)localObject1).cJQ();
          return 0;
        case 10: 
          localazs.pru = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 11: 
          localazs.scq.add(((f.a.a.a.a)localObject1).vHC.readString());
          return 0;
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ccr();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ccr)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
          localazs.scr = ((ccr)localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/azs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */