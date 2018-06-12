package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class cgm
  extends bhd
{
  public String bPS;
  public LinkedList<String> sAI = new LinkedList();
  public boolean sAJ;
  public String sAK;
  
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
      if (this.bPS != null) {
        paramVarArgs.g(2, this.bPS);
      }
      paramVarArgs.d(3, 1, this.sAI);
      paramVarArgs.av(4, this.sAJ);
      if (this.sAK != null) {
        paramVarArgs.g(5, this.sAK);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label466;
      }
    }
    label466:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.bPS != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.bPS);
      }
      i = i + f.a.a.a.c(3, 1, this.sAI) + (f.a.a.b.b.a.ec(4) + 1);
      paramInt = i;
      if (this.sAK != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.sAK);
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.sAI.clear();
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
        cgm localcgm = (cgm)paramVarArgs[1];
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
            localcgm.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localcgm.bPS = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localcgm.sAI.add(((f.a.a.a.a)localObject1).vHC.readString());
          return 0;
        case 4: 
          localcgm.sAJ = ((f.a.a.a.a)localObject1).cJQ();
          return 0;
        }
        localcgm.sAK = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/cgm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */