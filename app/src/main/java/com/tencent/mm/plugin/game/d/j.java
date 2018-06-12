package com.tencent.mm.plugin.game.d;

import java.util.LinkedList;

public final class j
  extends com.tencent.mm.bk.a
{
  public String jPA;
  public String jPB;
  public int jPC;
  public a jPD;
  public cz jPE;
  public int jPF;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.jPB != null) {
        paramVarArgs.g(1, this.jPB);
      }
      paramVarArgs.fT(2, this.jPC);
      if (this.jPD != null)
      {
        paramVarArgs.fV(3, this.jPD.boi());
        this.jPD.a(paramVarArgs);
      }
      if (this.jPE != null)
      {
        paramVarArgs.fV(4, this.jPE.boi());
        this.jPE.a(paramVarArgs);
      }
      paramVarArgs.fT(5, this.jPF);
      if (this.jPA != null) {
        paramVarArgs.g(6, this.jPA);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.jPB == null) {
        break label610;
      }
    }
    label610:
    for (paramInt = f.a.a.b.b.a.h(1, this.jPB) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.jPC);
      paramInt = i;
      if (this.jPD != null) {
        paramInt = i + f.a.a.a.fS(3, this.jPD.boi());
      }
      i = paramInt;
      if (this.jPE != null) {
        i = paramInt + f.a.a.a.fS(4, this.jPE.boi());
      }
      i += f.a.a.a.fQ(5, this.jPF);
      paramInt = i;
      if (this.jPA != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.jPA);
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
        j localj = (j)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          localj.jPB = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          localj.jPC = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new a();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((a)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localj.jPD = ((a)localObject1);
            paramInt += 1;
          }
        case 4: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new cz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localj.jPE = ((cz)localObject1);
            paramInt += 1;
          }
        case 5: 
          localj.jPF = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localj.jPA = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/game/d/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */