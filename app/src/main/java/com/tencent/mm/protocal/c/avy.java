package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class avy
  extends bhp
{
  public int qZH;
  public bhy rYQ;
  public bhy rYR;
  public int rYS;
  public int rYT;
  public LinkedList<pm> rYU = new LinkedList();
  public int rlm;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.six == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.rYQ == null) {
        throw new b("Not all required fields were included: CurrentSynckey");
      }
      if (this.rYR == null) {
        throw new b("Not all required fields were included: MaxSynckey");
      }
      if (this.six != null)
      {
        paramVarArgs.fV(1, this.six.boi());
        this.six.a(paramVarArgs);
      }
      if (this.rYQ != null)
      {
        paramVarArgs.fV(2, this.rYQ.boi());
        this.rYQ.a(paramVarArgs);
      }
      if (this.rYR != null)
      {
        paramVarArgs.fV(3, this.rYR.boi());
        this.rYR.a(paramVarArgs);
      }
      paramVarArgs.fT(4, this.rlm);
      paramVarArgs.fT(5, this.rYS);
      paramVarArgs.fT(6, this.rYT);
      paramVarArgs.d(7, 8, this.rYU);
      paramVarArgs.fT(8, this.qZH);
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label952;
      }
    }
    label952:
    for (int i = f.a.a.a.fS(1, this.six.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rYQ != null) {
        paramInt = i + f.a.a.a.fS(2, this.rYQ.boi());
      }
      i = paramInt;
      if (this.rYR != null) {
        i = paramInt + f.a.a.a.fS(3, this.rYR.boi());
      }
      return i + f.a.a.a.fQ(4, this.rlm) + f.a.a.a.fQ(5, this.rYS) + f.a.a.a.fQ(6, this.rYT) + f.a.a.a.c(7, 8, this.rYU) + f.a.a.a.fQ(8, this.qZH);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rYU.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = bhp.a(paramVarArgs); paramInt > 0; paramInt = bhp.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.six == null) {
          throw new b("Not all required fields were included: BaseResponse");
        }
        if (this.rYQ == null) {
          throw new b("Not all required fields were included: CurrentSynckey");
        }
        if (this.rYR != null) {
          break;
        }
        throw new b("Not all required fields were included: MaxSynckey");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        avy localavy = (avy)paramVarArgs[1];
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
            localavy.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localavy.rYQ = ((bhy)localObject1);
            paramInt += 1;
          }
        case 3: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localavy.rYR = ((bhy)localObject1);
            paramInt += 1;
          }
        case 4: 
          localavy.rlm = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localavy.rYS = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          localavy.rYT = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new pm();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((pm)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localavy.rYU.add(localObject1);
            paramInt += 1;
          }
        }
        localavy.qZH = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/avy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */