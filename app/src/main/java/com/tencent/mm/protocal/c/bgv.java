package com.tencent.mm.protocal.c;

import com.tencent.mm.bk.b;
import java.util.LinkedList;

public final class bgv
  extends bhd
{
  public float bSx;
  public float bUg;
  public String cac;
  public float shF;
  public b shG;
  public boolean shH;
  public boolean shI;
  
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
      paramVarArgs.l(2, this.bUg);
      paramVarArgs.l(3, this.bSx);
      paramVarArgs.l(4, this.shF);
      if (this.shG != null) {
        paramVarArgs.b(5, this.shG);
      }
      if (this.cac != null) {
        paramVarArgs.g(6, this.cac);
      }
      paramVarArgs.av(7, this.shH);
      paramVarArgs.av(8, this.shI);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label557;
      }
    }
    label557:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + (f.a.a.b.b.a.ec(2) + 4) + (f.a.a.b.b.a.ec(3) + 4) + (f.a.a.b.b.a.ec(4) + 4);
      paramInt = i;
      if (this.shG != null) {
        paramInt = i + f.a.a.a.a(5, this.shG);
      }
      i = paramInt;
      if (this.cac != null) {
        i = paramInt + f.a.a.b.b.a.h(6, this.cac);
      }
      return i + (f.a.a.b.b.a.ec(7) + 1) + (f.a.a.b.b.a.ec(8) + 1);
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
        bgv localbgv = (bgv)paramVarArgs[1];
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
            localbgv.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbgv.bUg = ((f.a.a.a.a)localObject1).vHC.readFloat();
          return 0;
        case 3: 
          localbgv.bSx = ((f.a.a.a.a)localObject1).vHC.readFloat();
          return 0;
        case 4: 
          localbgv.shF = ((f.a.a.a.a)localObject1).vHC.readFloat();
          return 0;
        case 5: 
          localbgv.shG = ((f.a.a.a.a)localObject1).cJR();
          return 0;
        case 6: 
          localbgv.cac = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localbgv.shH = ((f.a.a.a.a)localObject1).cJQ();
          return 0;
        }
        localbgv.shI = ((f.a.a.a.a)localObject1).cJQ();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/bgv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */