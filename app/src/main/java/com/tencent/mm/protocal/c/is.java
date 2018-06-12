package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class is
  extends bhd
{
  public int qZe;
  public String qZf;
  public String riA;
  public ark rjW;
  public bij rjX;
  
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
      if (this.riA != null) {
        paramVarArgs.g(2, this.riA);
      }
      if (this.rjW != null)
      {
        paramVarArgs.fV(3, this.rjW.boi());
        this.rjW.a(paramVarArgs);
      }
      if (this.rjX != null)
      {
        paramVarArgs.fV(4, this.rjX.boi());
        this.rjX.a(paramVarArgs);
      }
      paramVarArgs.fT(5, this.qZe);
      if (this.qZf != null) {
        paramVarArgs.g(6, this.qZf);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label716;
      }
    }
    label716:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.riA != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.riA);
      }
      i = paramInt;
      if (this.rjW != null) {
        i = paramInt + f.a.a.a.fS(3, this.rjW.boi());
      }
      paramInt = i;
      if (this.rjX != null) {
        paramInt = i + f.a.a.a.fS(4, this.rjX.boi());
      }
      i = paramInt + f.a.a.a.fQ(5, this.qZe);
      paramInt = i;
      if (this.qZf != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.qZf);
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
        is localis = (is)paramVarArgs[1];
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
            localis.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localis.riA = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new ark();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ark)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localis.rjW = ((ark)localObject1);
            paramInt += 1;
          }
        case 4: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bij();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bij)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localis.rjX = ((bij)localObject1);
            paramInt += 1;
          }
        case 5: 
          localis.qZe = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localis.qZf = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/is.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */