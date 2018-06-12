package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class akl
  extends bhd
{
  public String bPS;
  public String rLl;
  public String rMZ;
  public int rNa;
  public int rNb;
  public ayx rNc;
  public int rkb;
  public int type;
  
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
      paramVarArgs.fT(2, this.type);
      if (this.bPS != null) {
        paramVarArgs.g(3, this.bPS);
      }
      paramVarArgs.fT(4, this.rkb);
      if (this.rMZ != null) {
        paramVarArgs.g(5, this.rMZ);
      }
      paramVarArgs.fT(6, this.rNa);
      paramVarArgs.fT(7, this.rNb);
      if (this.rLl != null) {
        paramVarArgs.g(8, this.rLl);
      }
      if (this.rNc != null)
      {
        paramVarArgs.fV(10, this.rNc.boi());
        this.rNc.a(paramVarArgs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label751;
      }
    }
    label751:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.type);
      paramInt = i;
      if (this.bPS != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.bPS);
      }
      i = paramInt + f.a.a.a.fQ(4, this.rkb);
      paramInt = i;
      if (this.rMZ != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.rMZ);
      }
      i = paramInt + f.a.a.a.fQ(6, this.rNa) + f.a.a.a.fQ(7, this.rNb);
      paramInt = i;
      if (this.rLl != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.rLl);
      }
      i = paramInt;
      if (this.rNc != null) {
        i = paramInt + f.a.a.a.fS(10, this.rNc.boi());
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
        akl localakl = (akl)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        case 9: 
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
            localakl.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localakl.type = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localakl.bPS = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localakl.rkb = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localakl.rMZ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localakl.rNa = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localakl.rNb = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 8: 
          localakl.rLl = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ayx();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ayx)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
          localakl.rNc = ((ayx)localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/akl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */