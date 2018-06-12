package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class aen
  extends bhd
{
  public String jjP;
  public String jjQ;
  public String jjR;
  public String qZf;
  public sf qZw;
  
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
      if (this.jjP != null) {
        paramVarArgs.g(2, this.jjP);
      }
      if (this.jjQ != null) {
        paramVarArgs.g(3, this.jjQ);
      }
      if (this.jjR != null) {
        paramVarArgs.g(4, this.jjR);
      }
      if (this.qZf != null) {
        paramVarArgs.g(5, this.qZf);
      }
      if (this.qZw != null)
      {
        paramVarArgs.fV(6, this.qZw.boi());
        this.qZw.a(paramVarArgs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label642;
      }
    }
    label642:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.jjP != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.jjP);
      }
      i = paramInt;
      if (this.jjQ != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.jjQ);
      }
      paramInt = i;
      if (this.jjR != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.jjR);
      }
      i = paramInt;
      if (this.qZf != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.qZf);
      }
      paramInt = i;
      if (this.qZw != null) {
        paramInt = i + f.a.a.a.fS(6, this.qZw.boi());
      }
      return paramInt;
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
        aen localaen = (aen)paramVarArgs[1];
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
            localaen.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localaen.jjP = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localaen.jjQ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localaen.jjR = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localaen.qZf = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new sf();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((sf)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
          localaen.qZw = ((sf)localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/aen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */