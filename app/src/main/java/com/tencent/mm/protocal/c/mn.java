package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class mn
  extends bhd
{
  public String desc;
  public boolean rqC;
  public boolean rqD;
  public LinkedList<Integer> rqc = new LinkedList();
  
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
      paramVarArgs.d(2, 2, this.rqc);
      if (this.desc != null) {
        paramVarArgs.g(3, this.desc);
      }
      paramVarArgs.av(4, this.rqC);
      paramVarArgs.av(5, this.rqD);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label446;
      }
    }
    label446:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.c(2, 2, this.rqc);
      paramInt = i;
      if (this.desc != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.desc);
      }
      return paramInt + (f.a.a.b.b.a.ec(4) + 1) + (f.a.a.b.b.a.ec(5) + 1);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rqc.clear();
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
        mn localmn = (mn)paramVarArgs[1];
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
            localmn.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localmn.rqc.add(Integer.valueOf(((f.a.a.a.a)localObject1).vHC.rY()));
          return 0;
        case 3: 
          localmn.desc = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localmn.rqC = ((f.a.a.a.a)localObject1).cJQ();
          return 0;
        }
        localmn.rqD = ((f.a.a.a.a)localObject1).cJQ();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/mn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */