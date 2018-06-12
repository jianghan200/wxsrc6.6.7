package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class ama
  extends bhp
{
  public bhy rOI;
  public bhy rOJ;
  public int rOK;
  public int rOL;
  public int rOM;
  public bhy rer;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.six == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.rer == null) {
        throw new b("Not all required fields were included: SessionKey");
      }
      if (this.rOI == null) {
        throw new b("Not all required fields were included: SessionBuffer");
      }
      if (this.rOJ == null) {
        throw new b("Not all required fields were included: KeyBuffer");
      }
      if (this.six != null)
      {
        paramVarArgs.fV(1, this.six.boi());
        this.six.a(paramVarArgs);
      }
      if (this.rer != null)
      {
        paramVarArgs.fV(2, this.rer.boi());
        this.rer.a(paramVarArgs);
      }
      if (this.rOI != null)
      {
        paramVarArgs.fV(3, this.rOI.boi());
        this.rOI.a(paramVarArgs);
      }
      if (this.rOJ != null)
      {
        paramVarArgs.fV(4, this.rOJ.boi());
        this.rOJ.a(paramVarArgs);
      }
      paramVarArgs.fT(5, this.rOK);
      paramVarArgs.fT(6, this.rOL);
      paramVarArgs.fT(7, this.rOM);
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label965;
      }
    }
    label965:
    for (int i = f.a.a.a.fS(1, this.six.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rer != null) {
        paramInt = i + f.a.a.a.fS(2, this.rer.boi());
      }
      i = paramInt;
      if (this.rOI != null) {
        i = paramInt + f.a.a.a.fS(3, this.rOI.boi());
      }
      paramInt = i;
      if (this.rOJ != null) {
        paramInt = i + f.a.a.a.fS(4, this.rOJ.boi());
      }
      return paramInt + f.a.a.a.fQ(5, this.rOK) + f.a.a.a.fQ(6, this.rOL) + f.a.a.a.fQ(7, this.rOM);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhp.a(paramVarArgs); paramInt > 0; paramInt = bhp.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.six == null) {
          throw new b("Not all required fields were included: BaseResponse");
        }
        if (this.rer == null) {
          throw new b("Not all required fields were included: SessionKey");
        }
        if (this.rOI == null) {
          throw new b("Not all required fields were included: SessionBuffer");
        }
        if (this.rOJ != null) {
          break;
        }
        throw new b("Not all required fields were included: KeyBuffer");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        ama localama = (ama)paramVarArgs[1];
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
            localama.six = ((fl)localObject1);
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
            localama.rer = ((bhy)localObject1);
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
            localama.rOI = ((bhy)localObject1);
            paramInt += 1;
          }
        case 4: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localama.rOJ = ((bhy)localObject1);
            paramInt += 1;
          }
        case 5: 
          localama.rOK = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          localama.rOL = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localama.rOM = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/ama.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */