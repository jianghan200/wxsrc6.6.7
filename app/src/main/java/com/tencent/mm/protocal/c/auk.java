package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class auk
  extends bhd
{
  public int otY;
  public int rXC;
  public LinkedList<auj> rXD = new LinkedList();
  public int rXE;
  public String rXF;
  public int rbY;
  public LinkedList<aum> rgH = new LinkedList();
  
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
      paramVarArgs.fT(2, this.rbY);
      paramVarArgs.fT(3, this.rXC);
      paramVarArgs.d(4, 8, this.rXD);
      paramVarArgs.fT(5, this.rXE);
      paramVarArgs.d(6, 8, this.rgH);
      if (this.rXF != null) {
        paramVarArgs.g(7, this.rXF);
      }
      paramVarArgs.fT(8, this.otY);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label746;
      }
    }
    label746:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.rbY) + f.a.a.a.fQ(3, this.rXC) + f.a.a.a.c(4, 8, this.rXD) + f.a.a.a.fQ(5, this.rXE) + f.a.a.a.c(6, 8, this.rgH);
      paramInt = i;
      if (this.rXF != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.rXF);
      }
      return paramInt + f.a.a.a.fQ(8, this.otY);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rXD.clear();
        this.rgH.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
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
        auk localauk = (auk)paramVarArgs[1];
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
            localauk.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localauk.rbY = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localauk.rXC = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new auj();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((auj)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localauk.rXD.add(localObject1);
            paramInt += 1;
          }
        case 5: 
          localauk.rXE = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new aum();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((aum)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localauk.rgH.add(localObject1);
            paramInt += 1;
          }
        case 7: 
          localauk.rXF = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localauk.otY = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/auk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */