package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class agm
  extends bhd
{
  public String bIQ;
  public String bLe;
  public String jjP;
  public String jjQ;
  public String jjR;
  public String qZf;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      if (this.bIQ != null) {
        paramVarArgs.g(2, this.bIQ);
      }
      if (this.jjP != null) {
        paramVarArgs.g(3, this.jjP);
      }
      if (this.jjQ != null) {
        paramVarArgs.g(4, this.jjQ);
      }
      if (this.jjR != null) {
        paramVarArgs.g(5, this.jjR);
      }
      if (this.bLe != null) {
        paramVarArgs.g(6, this.bLe);
      }
      if (this.qZf != null) {
        paramVarArgs.g(7, this.qZf);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label607;
      }
    }
    label607:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.bIQ != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.bIQ);
      }
      i = paramInt;
      if (this.jjP != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.jjP);
      }
      paramInt = i;
      if (this.jjQ != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.jjQ);
      }
      i = paramInt;
      if (this.jjR != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.jjR);
      }
      paramInt = i;
      if (this.bLe != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.bLe);
      }
      i = paramInt;
      if (this.qZf != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.qZf);
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
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        agm localagm = (agm)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
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
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new fk();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((fk)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localagm.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localagm.bIQ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localagm.jjP = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localagm.jjQ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localagm.jjR = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localagm.bLe = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localagm.qZf = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/agm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */