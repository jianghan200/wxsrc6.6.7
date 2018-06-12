package com.tencent.mm.plugin.game.d;

import java.util.LinkedList;

public final class al
  extends com.tencent.mm.bk.a
{
  public String bHD;
  public String jPA;
  public String jQS;
  public LinkedList<cs> jQT = new LinkedList();
  public dl jQU;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.jQS != null) {
        paramVarArgs.g(1, this.jQS);
      }
      if (this.bHD != null) {
        paramVarArgs.g(2, this.bHD);
      }
      paramVarArgs.d(3, 8, this.jQT);
      if (this.jQU != null)
      {
        paramVarArgs.fV(4, this.jQU.boi());
        this.jQU.a(paramVarArgs);
      }
      if (this.jPA != null) {
        paramVarArgs.g(5, this.jPA);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.jQS == null) {
        break label571;
      }
    }
    label571:
    for (paramInt = f.a.a.b.b.a.h(1, this.jQS) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.bHD != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.bHD);
      }
      i += f.a.a.a.c(3, 8, this.jQT);
      paramInt = i;
      if (this.jQU != null) {
        paramInt = i + f.a.a.a.fS(4, this.jQU.boi());
      }
      i = paramInt;
      if (this.jPA != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.jPA);
      }
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.jQT.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
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
        al localal = (al)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          localal.jQS = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          localal.bHD = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new cs();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cs)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localal.jQT.add(localObject1);
            paramInt += 1;
          }
        case 4: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new dl();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((dl)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localal.jQU = ((dl)localObject1);
            paramInt += 1;
          }
        }
        localal.jPA = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/game/d/al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */