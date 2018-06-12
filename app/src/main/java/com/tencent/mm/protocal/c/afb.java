package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class afb
  extends bhd
{
  public int Height;
  public int Width;
  public String iwP;
  public int rJk;
  public int rJl;
  public float rmr;
  public float rms;
  
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
      paramVarArgs.l(2, this.rmr);
      paramVarArgs.l(3, this.rms);
      paramVarArgs.fT(4, this.Width);
      paramVarArgs.fT(5, this.Height);
      if (this.iwP != null) {
        paramVarArgs.g(6, this.iwP);
      }
      paramVarArgs.fT(7, this.rJk);
      paramVarArgs.fT(8, this.rJl);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label554;
      }
    }
    label554:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + (f.a.a.b.b.a.ec(2) + 4) + (f.a.a.b.b.a.ec(3) + 4) + f.a.a.a.fQ(4, this.Width) + f.a.a.a.fQ(5, this.Height);
      paramInt = i;
      if (this.iwP != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.iwP);
      }
      return paramInt + f.a.a.a.fQ(7, this.rJk) + f.a.a.a.fQ(8, this.rJl);
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
        afb localafb = (afb)paramVarArgs[1];
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
            localafb.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localafb.rmr = ((f.a.a.a.a)localObject1).vHC.readFloat();
          return 0;
        case 3: 
          localafb.rms = ((f.a.a.a.a)localObject1).vHC.readFloat();
          return 0;
        case 4: 
          localafb.Width = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localafb.Height = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          localafb.iwP = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localafb.rJk = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localafb.rJl = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/afb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */