package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class amg
  extends com.tencent.mm.bk.a
{
  public fj rOP;
  public kk rOQ;
  public atk rOR;
  public brf rOS;
  public bip rOT;
  public po rOU;
  public xd rOV;
  public xu rOW;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rOP != null)
      {
        paramVarArgs.fV(1, this.rOP.boi());
        this.rOP.a(paramVarArgs);
      }
      if (this.rOQ != null)
      {
        paramVarArgs.fV(2, this.rOQ.boi());
        this.rOQ.a(paramVarArgs);
      }
      if (this.rOR != null)
      {
        paramVarArgs.fV(3, this.rOR.boi());
        this.rOR.a(paramVarArgs);
      }
      if (this.rOS != null)
      {
        paramVarArgs.fV(4, this.rOS.boi());
        this.rOS.a(paramVarArgs);
      }
      if (this.rOT != null)
      {
        paramVarArgs.fV(6, this.rOT.boi());
        this.rOT.a(paramVarArgs);
      }
      if (this.rOU != null)
      {
        paramVarArgs.fV(7, this.rOU.boi());
        this.rOU.a(paramVarArgs);
      }
      if (this.rOV != null)
      {
        paramVarArgs.fV(8, this.rOV.boi());
        this.rOV.a(paramVarArgs);
      }
      if (this.rOW != null)
      {
        paramVarArgs.fV(9, this.rOW.boi());
        this.rOW.a(paramVarArgs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.rOP == null) {
        break label1312;
      }
    }
    label1312:
    for (int i = f.a.a.a.fS(1, this.rOP.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rOQ != null) {
        paramInt = i + f.a.a.a.fS(2, this.rOQ.boi());
      }
      i = paramInt;
      if (this.rOR != null) {
        i = paramInt + f.a.a.a.fS(3, this.rOR.boi());
      }
      paramInt = i;
      if (this.rOS != null) {
        paramInt = i + f.a.a.a.fS(4, this.rOS.boi());
      }
      i = paramInt;
      if (this.rOT != null) {
        i = paramInt + f.a.a.a.fS(6, this.rOT.boi());
      }
      paramInt = i;
      if (this.rOU != null) {
        paramInt = i + f.a.a.a.fS(7, this.rOU.boi());
      }
      i = paramInt;
      if (this.rOV != null) {
        i = paramInt + f.a.a.a.fS(8, this.rOV.boi());
      }
      paramInt = i;
      if (this.rOW != null) {
        paramInt = i + f.a.a.a.fS(9, this.rOW.boi());
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
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
        amg localamg = (amg)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        case 5: 
        default: 
          return -1;
        case 1: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new fj();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((fj)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localamg.rOP = ((fj)localObject1);
            paramInt += 1;
          }
        case 2: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new kk();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((kk)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localamg.rOQ = ((kk)localObject1);
            paramInt += 1;
          }
        case 3: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new atk();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((atk)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localamg.rOR = ((atk)localObject1);
            paramInt += 1;
          }
        case 4: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new brf();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((brf)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localamg.rOS = ((brf)localObject1);
            paramInt += 1;
          }
        case 6: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bip();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bip)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localamg.rOT = ((bip)localObject1);
            paramInt += 1;
          }
        case 7: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new po();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((po)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localamg.rOU = ((po)localObject1);
            paramInt += 1;
          }
        case 8: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new xd();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((xd)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localamg.rOV = ((xd)localObject1);
            paramInt += 1;
          }
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new xu();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((xu)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localamg.rOW = ((xu)localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/amg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */