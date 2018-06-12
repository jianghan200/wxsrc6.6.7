package com.tencent.mm.plugin.product.c;

import f.a.a.b;
import java.util.LinkedList;

public class l
  extends com.tencent.mm.bk.a
{
  public String lRR;
  public int lRS;
  public LinkedList<e> lRT = new LinkedList();
  public int lRn;
  public String url;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.lRR == null) {
        throw new b("Not all required fields were included: id_info");
      }
      if (this.lRR != null) {
        paramVarArgs.g(1, this.lRR);
      }
      paramVarArgs.fT(2, this.lRS);
      if (this.url != null) {
        paramVarArgs.g(3, this.url);
      }
      paramVarArgs.d(4, 8, this.lRT);
      paramVarArgs.fT(5, this.lRn);
      return 0;
    }
    if (paramInt == 1) {
      if (this.lRR == null) {
        break label477;
      }
    }
    label477:
    for (paramInt = f.a.a.b.b.a.h(1, this.lRR) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.lRS);
      paramInt = i;
      if (this.url != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.url);
      }
      return paramInt + f.a.a.a.c(4, 8, this.lRT) + f.a.a.a.fQ(5, this.lRn);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.lRT.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.lRR != null) {
          break;
        }
        throw new b("Not all required fields were included: id_info");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        l locall = (l)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          locall.lRR = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          locall.lRS = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          locall.url = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new e();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((e)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            locall.lRT.add(localObject1);
            paramInt += 1;
          }
        }
        locall.lRn = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/product/c/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */